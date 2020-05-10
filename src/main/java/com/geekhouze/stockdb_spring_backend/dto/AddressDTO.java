package com.geekhouze.stockdb_spring_backend.dto;

public class AddressDTO {

    private int cityId;
    private String address;
    private String address_region;
    private long Postalcode ;


    public AddressDTO() {
    }

    public AddressDTO(int cityId, String address, String address_region, long postalcode) {
        this.cityId = cityId;
        this.address = address;
        this.address_region = address_region;
        Postalcode = postalcode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress_region() {
        return address_region;
    }

    public void setAddress_region(String address_region) {
        this.address_region = address_region;
    }

    public long getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(long postalcode) {
        Postalcode = postalcode;
    }
}