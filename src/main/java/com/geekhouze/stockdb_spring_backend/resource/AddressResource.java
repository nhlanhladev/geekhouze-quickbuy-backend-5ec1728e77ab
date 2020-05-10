package com.geekhouze.stockdb_spring_backend.resource;


import com.geekhouze.stockdb_spring_backend.dto.AddressDTO;
import com.geekhouze.stockdb_spring_backend.model.Address;
import com.geekhouze.stockdb_spring_backend.repository.AddressRepository;
import com.geekhouze.stockdb_spring_backend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class AddressResource  {


    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CityRepository cityRepository;



    @RequestMapping(value ="/address",method =RequestMethod.POST)
    public Address SaveAddress(@RequestBody AddressDTO addressDTO){


        Address address = new Address();

        address.setAddress(addressDTO.getAddress());
        address.setAddress_region(addressDTO.getAddress_region());
        address.setPostalcode(addressDTO.getPostalcode());
        address.setCreated_at(new Date());
        address.setUpdated_at(new Date());
        address.setCity(cityRepository.getOne((long) addressDTO.getCityId()));

        return addressRepository.save(address);
    }
}
