package com.geekhouze.stockdb_spring_backend.repository;

import com.geekhouze.stockdb_spring_backend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
