package com.zipcode.example.repository;

import com.zipcode.example.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City, Integer> {
    //List<City> findByName(String name);
}
