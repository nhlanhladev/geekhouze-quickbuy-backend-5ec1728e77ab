package com.geekhouze.stockdb_spring_backend.resource;

import com.geekhouze.stockdb_spring_backend.dto.CountryDTO;
import com.geekhouze.stockdb_spring_backend.model.Country;
import com.geekhouze.stockdb_spring_backend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;


    @GetMapping(value = "/")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    @PostMapping(value = "/country")
    public ResponseEntity<Country> addCountries(@RequestBody CountryDTO countryDTO) {
        Country country = new Country();
        country.setName(countryDTO.getName());
        country.setCreateAt(new Date());
        country.setUpdateAt(new Date());
        return new ResponseEntity<>(countryRepository.save(country),
                HttpStatus.OK);
    }
}
