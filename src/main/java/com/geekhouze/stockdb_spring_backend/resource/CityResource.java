package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.dto.CityDTO;
import com.geekhouze.stockdb_spring_backend.model.City;
import com.geekhouze.stockdb_spring_backend.repository.CityRepository;
import com.geekhouze.stockdb_spring_backend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class CityResource {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CountryRepository countryRepository;

    @RequestMapping(name ="/city",method = RequestMethod.POST)
    public City SaveCity(@RequestBody CityDTO cityDTO){

      City city = new City();

      city.setName(cityDTO.getName());
      city.setCreatedAt(new Date());
      city.setUpdatedAt(new Date());
      city.setCountry(countryRepository.getOne((long) cityDTO.getCountryId()));

      return cityRepository.save(city);
    }
}
