package com.geekhouze.stockdb_spring_backend.dto;


public class ItemDTO {

    private String name;

    private String description;

    private Double price;

    private String unique_number;

    private long category_id;

    private long store_id;

    private long[] images;

    public ItemDTO() {
    }

    public ItemDTO(String name, String description, Double price, String unique_number, long category_id, long store_id, long[] images) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.unique_number = unique_number;
        this.category_id = category_id;
        this.store_id = store_id;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(String unique_number) {
        this.unique_number = unique_number;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public long getStore_id() {
        return store_id;
    }

    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    public long[] getImages() {
        return images;
    }

    public void setImages(long[] images) {
        this.images = images;
    }
}

