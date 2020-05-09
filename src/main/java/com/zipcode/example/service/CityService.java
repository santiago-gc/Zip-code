package com.zipcode.example.service;

import com.zipcode.example.entity.City;
import com.zipcode.example.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityService {

    @Autowired
    private CityRepository repository;

    public City savePostal(City MyCity) {
        return repository.save(MyCity);
    }

    public List<City> saveManyPostals(List<City> MyCities) {
        return repository.saveAll(MyCities);
    }

    public List<City> getAllPostals(){
        return repository.findAll();
    }

    public City getPostalById(int id) {
        return repository.findById(id).orElse(null);
    }

//    public List<City> getPostalByName(String name) {
//        return repository.findByName(name);
//    }

    public String deleteCity(int id) {
        repository.deleteById(id);
        return "City removed ->"+id;
    }
}
