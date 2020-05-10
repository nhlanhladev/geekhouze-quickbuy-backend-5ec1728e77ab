package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.dto.CategoryDTO;
import com.geekhouze.stockdb_spring_backend.model.Category;
import com.geekhouze.stockdb_spring_backend.model.Image;
import com.geekhouze.stockdb_spring_backend.repository.CategoryRepository;
import com.geekhouze.stockdb_spring_backend.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class CategoryResource {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ImageRepository imageRepository;


    @RequestMapping(value ="/category",method = RequestMethod.POST)
    public Category SaveCategory(@RequestBody CategoryDTO categoryDTO){

         Category category = new Category();

         category.setName(categoryDTO.getName());
         category.setDescription(categoryDTO.getDescription());
         category.setCreated_at(new Date());
         category.setUpdated_at(new Date());
         category.setImage(imageRepository.getOne((long) categoryDTO.getImageId()));

         return categoryRepository.save(category);
    }

}
