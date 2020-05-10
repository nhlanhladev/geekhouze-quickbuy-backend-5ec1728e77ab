package com.geekhouze.stockdb_spring_backend.dto;

public class StoreDTO {

    private String name;
    private String description;
    private int imageId;

    public StoreDTO() {
    }

    public StoreDTO(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public StoreDTO setImageId(int imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StoreDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
