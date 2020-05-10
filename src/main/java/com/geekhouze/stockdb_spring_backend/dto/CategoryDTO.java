package com.geekhouze.stockdb_spring_backend.dto;

import com.geekhouze.stockdb_spring_backend.model.Image;

import javax.persistence.*;
import java.util.Date;


public class CategoryDTO {


    private String name;

    private String description;

    private int imageId;



    public CategoryDTO(){
    }


    public CategoryDTO(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;

    }
    public int getImageId() {
        return imageId;
    }

    public CategoryDTO setImageId(int imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryDTO setDescription(String description) {
        this.description = description;
        return this;
    }


}
