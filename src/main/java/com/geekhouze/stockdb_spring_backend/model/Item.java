package com.geekhouze.stockdb_spring_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "item")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name ="name")
    private String name;
    @Column(name ="description")
    private String description;
    @Column(name ="price")
    private Double price;
    @Column(name ="unique_number")
    private String unique_number;
    @Column(name ="created_at")
    private Date created_at;
    @Column(name ="updated_at")
    private Date updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private Store store;

    //@JsonBackReference
    @OneToMany(mappedBy = "item", cascade=CascadeType.ALL)
    private Set<ItemImage> itemImageAssociations;

    public Item() {
    }

    public Item(String name, String description, Double price, String unique_number, Date created_at, Date updated_at, Category category, Store store, Set<ItemImage> itemImageAssociations) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.unique_number = unique_number;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.category = category;
        this.store = store;
        this.itemImageAssociations = itemImageAssociations;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Set<ItemImage> getItemImageAssociations() {
        return itemImageAssociations;
    }

    public void setItemImageAssociations(Set<ItemImage> itemImageAssociations) {
        this.itemImageAssociations = itemImageAssociations;
    }

}
