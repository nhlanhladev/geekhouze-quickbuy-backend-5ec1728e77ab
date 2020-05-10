package com.geekhouze.stockdb_spring_backend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "path")
    private String path;
    @Column(name = "name")
    private String name;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "server_id", referencedColumnName = "id")
    private Server server;

    @OneToMany(mappedBy="image",cascade=CascadeType.ALL)
    private Set<ItemImage> itemImageAssociations;

    public Image() {
    }

    public Image(String path, String name, Date created_at, Date updated_at, Server server) {
        this.path = path;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.server = server;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

}
