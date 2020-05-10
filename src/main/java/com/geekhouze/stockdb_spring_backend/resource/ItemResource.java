package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.dto.ItemDTO;
import com.geekhouze.stockdb_spring_backend.model.Image;
import com.geekhouze.stockdb_spring_backend.model.Item;
import com.geekhouze.stockdb_spring_backend.model.ItemImage;
import com.geekhouze.stockdb_spring_backend.repository.CategoryRepository;
import com.geekhouze.stockdb_spring_backend.repository.ImageRepository;
import com.geekhouze.stockdb_spring_backend.repository.ItemRepository;
import com.geekhouze.stockdb_spring_backend.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class ItemResource  {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    ImageRepository imageRepository;

    @RequestMapping(value = "/items/",method = RequestMethod.POST)
    public ResponseEntity<Item> saveItem(@RequestBody ItemDTO itemDTO) {

        Item item = new Item();
        item.setCategory(categoryRepository.getOne(itemDTO.getCategory_id()));
        item.setCreated_at(new Date());
        item.setDescription(itemDTO.getDescription());
        item.setName(itemDTO.getName());
        item.setPrice(itemDTO.getPrice());
        item.setStore(storeRepository.getOne(itemDTO.getStore_id()));
        item.setUnique_number(itemDTO.getUnique_number());
        item.setUpdated_at(new Date());
        item = itemRepository.save(item);

        // * Build relationships between the item and image
        Set<ItemImage> itemImages = new HashSet<>();
        for(long imageId: itemDTO.getImages()) {
            Image image = imageRepository.getOne(imageId);
            ItemImage itemImage = new ItemImage();
            itemImage.setCreatedAt(new Date());
            itemImage.setItem(item);
            itemImage.setImage(image);
            itemImages.add(itemImage);
        }
        item.setItemImageAssociations(itemImages);
        itemRepository.save(item);

        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @RequestMapping(value = "/items/",method = RequestMethod.GET)
    public ResponseEntity<List<Item>> getItems() {
        List<Item> all = itemRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
