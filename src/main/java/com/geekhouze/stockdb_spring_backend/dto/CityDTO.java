package com.geekhouze.stockdb_spring_backend.dto;

public class CityDTO {

    private String name;
    private int countryId;

    public CityDTO() {
    }

    public CityDTO(String name, int countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
