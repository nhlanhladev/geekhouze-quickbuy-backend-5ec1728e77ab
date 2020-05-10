package com.geekhouze.stockdb_spring_backend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "itemImage")
@IdClass(ItemImageId.class)
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "item")
public class ItemImage {

    @Column(name = "created_at")
    private Date createdAt;

    //@JsonManagedReference
    @Id
    @ManyToOne(cascade=CascadeType.ALL)
    @MapsId("id")
    private Item item;

    @Id
    @ManyToOne(cascade=CascadeType.ALL)
    @MapsId("id")
    private Image image;

    public ItemImage() {
    }

    public ItemImage(Date createdAt, Item item, Image image) {
        this.createdAt = createdAt;
        this.item = item;
        this.image = image;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
