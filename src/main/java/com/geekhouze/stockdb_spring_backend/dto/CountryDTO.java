package com.geekhouze.stockdb_spring_backend.dto;

public class CountryDTO {

    private String name;

    public CountryDTO() {
    }

    public CountryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
