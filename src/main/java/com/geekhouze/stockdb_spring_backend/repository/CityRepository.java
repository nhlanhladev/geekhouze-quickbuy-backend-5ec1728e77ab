package com.geekhouze.stockdb_spring_backend.repository;


import com.geekhouze.stockdb_spring_backend.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

}
