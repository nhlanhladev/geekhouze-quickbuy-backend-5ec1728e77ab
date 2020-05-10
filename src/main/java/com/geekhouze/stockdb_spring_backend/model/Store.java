package com.geekhouze.stockdb_spring_backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image image;

    public Image getImage() {
        return this.image;
    }

    public Store setImage(final Image image) {
        this.image = image;
        return this;
    }

    public long getId() {
        return id;
    }

    public Store setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Store setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Store setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Store setCreated_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public Store setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
        return this;
    }
}
