package com.zipcode.example.controller;

import com.zipcode.example.entity.City;
import com.zipcode.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/zip-code")
public class CityController {

    @Autowired
    private CityService myService;

    @PostMapping("/addCity")
    public City addCity(@RequestBody City MyRequest) {
        return myService.savePostal(MyRequest);
    }

    @PostMapping("/addManyCities")
    public List<City> addCities(@RequestBody List<City> MyRequest) {
        return myService.saveManyPostals(MyRequest);
    }

    @GetMapping("/allCities")
    public List<City>  allCities() {
        return myService.getAllPostals();
    }

    @GetMapping("/CityId/{id}")
    public  City findCitybyId(@PathVariable int id) {
        return myService.getPostalById(id);
    }

    //@GetMapping("/CityName/{name}")
    //public  List<City> findCitybyName(@PathVariable String name) {
    //  return myService.getPostalByName(name);
    //}

    @DeleteMapping("/delete/{id}")
    public String deleteCity(@PathVariable int id){
        return myService.deleteCity(id);
    }
}
