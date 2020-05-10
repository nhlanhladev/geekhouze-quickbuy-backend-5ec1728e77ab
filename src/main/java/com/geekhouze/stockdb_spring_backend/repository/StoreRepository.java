package com.geekhouze.stockdb_spring_backend.repository;

import com.geekhouze.stockdb_spring_backend.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
