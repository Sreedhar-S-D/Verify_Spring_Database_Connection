package com.example.connect_to_database_2.repository;

import com.example.connect_to_database_2.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

//    @Query("Select * from city where city.name = ")
    City findByName(String name);
}
