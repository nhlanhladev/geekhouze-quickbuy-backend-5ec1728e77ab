package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.model.User;
import com.geekhouze.stockdb_spring_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/")
    public List<User> addUser(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }

}
