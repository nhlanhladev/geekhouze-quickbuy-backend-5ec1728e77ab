package com.geekhouze.stockdb_spring_backend.resource;
import com.geekhouze.stockdb_spring_backend.model.Image;
import com.geekhouze.stockdb_spring_backend.model.Server;
import com.geekhouze.stockdb_spring_backend.repository.ImageRepository;
import com.geekhouze.stockdb_spring_backend.repository.ServerRepository;
import com.geekhouze.stockdb_spring_backend.storage.StorageFileNotFoundException;
import com.geekhouze.stockdb_spring_backend.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RestController
public class ImageResource {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    ServerRepository serverRepository;

    @Autowired
    StorageService storageService;

    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public Image handleFileUpload(@RequestParam("file") MultipartFile file) {
        Server server = serverRepository.getOne((long) 6);

        storageService.store(file);
        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setPath(storageService.getURI() + "/" +file.getOriginalFilename());
        image.setCreated_at(new Date());
        image.setUpdated_at(new Date());
        image.setServer(server);

        return imageRepository.save(image);
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
