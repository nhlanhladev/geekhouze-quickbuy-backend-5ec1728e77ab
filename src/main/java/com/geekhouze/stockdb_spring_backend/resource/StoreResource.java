package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.dto.StoreDTO;
import com.geekhouze.stockdb_spring_backend.model.Store;
import com.geekhouze.stockdb_spring_backend.repository.ImageRepository;
import com.geekhouze.stockdb_spring_backend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class StoreResource {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ImageRepository imageRepository;

    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public Store insertStore(@RequestBody StoreDTO storeDTO) {
        Store store = new Store();
        store.setName(storeDTO.getName())
                .setDescription(storeDTO.getDescription())
                .setCreated_at(new Date())
                .setUpdated_at(new Date())
                .setImage(imageRepository.getOne((long) storeDTO.getImageId()));
        return storeRepository.save(store);
    }
}
