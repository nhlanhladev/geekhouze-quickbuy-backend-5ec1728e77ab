package com.geekhouze.stockdb_spring_backend.resource;


import com.geekhouze.stockdb_spring_backend.model.Server;
import com.geekhouze.stockdb_spring_backend.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/servers")
public class ServerResource {

    @Autowired
    private ServerRepository serverRepository;


    @GetMapping(value ="/")
    public List<Server> getServer(){
        return serverRepository.findAll();
    }
    @PostMapping(value ="/")
    public List<Server>addServer(@RequestBody Server server){
        serverRepository.save(server);
        return serverRepository.findAll();
    }

}
