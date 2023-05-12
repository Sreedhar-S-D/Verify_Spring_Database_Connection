package com.example.connect_to_database_2.controller;

import com.example.connect_to_database_2.dto.CityDTO;
import com.example.connect_to_database_2.model.City;
import com.example.connect_to_database_2.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/city")
public class CityController {

    Logger logger = LoggerFactory.getLogger(CityController.class);
    @Autowired
    CityService cityService;

    @PostMapping()
    public void addCity(@RequestBody CityDTO cityDTO){
        logger.info("adding a city");
        cityService.createCityFromDTO(cityDTO);
        System.out.println("City created correctly");
    }

    @GetMapping()
    public City getCityWithName(@RequestParam("cityName") String cityName){
        return cityService.getCityWithName(cityName);
    }



}
