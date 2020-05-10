package com.geekhouze.stockdb_spring_backend.repository;

import com.geekhouze.stockdb_spring_backend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
