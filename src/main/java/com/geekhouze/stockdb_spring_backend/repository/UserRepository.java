package com.geekhouze.stockdb_spring_backend.repository;

import com.geekhouze.stockdb_spring_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
