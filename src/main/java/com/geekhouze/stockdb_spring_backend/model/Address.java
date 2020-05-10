package com.geekhouze.stockdb_spring_backend.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "address")
    private String address;

    @Column(name = "address_region")
    private String address_region;

    @Column(name = "address_postalcode")
    private Long postalcode;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    public Address() {
    }

    public Address(String address, String address_region, Long postalcode, Date created_at, Date updated_at, City city) {
        this.address = address;
        this.address_region = address_region;
        this.postalcode = postalcode;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Long getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Long postalcode) {
        this.postalcode = postalcode;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
