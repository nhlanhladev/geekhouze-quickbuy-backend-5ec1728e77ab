package com.geekhouze.stockdb_spring_backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "server")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name ="ip")
    private String ip;

    @Column(name ="port")
    private String port;

    @Column(name="created_at")
    private Date createAt;

    @Column(name ="updated_at")
    private Date updatedAt;

    public Server() {

    }

    public long getId() {
        return id;
    }

    public Server setId(long id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public Server setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getPort() {
        return port;
    }

    public Server setPort(String port) {
        this.port = port;
        return this;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Server setCreateAt(Date createAt) {
        this.createAt = createAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Server setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "Server{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
