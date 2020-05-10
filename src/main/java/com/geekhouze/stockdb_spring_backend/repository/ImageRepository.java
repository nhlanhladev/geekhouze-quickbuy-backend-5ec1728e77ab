package com.geekhouze.stockdb_spring_backend.repository;

import com.geekhouze.stockdb_spring_backend.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
