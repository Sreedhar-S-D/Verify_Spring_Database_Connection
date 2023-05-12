package com.example.connect_to_database_2.service;

import com.example.connect_to_database_2.dto.CityDTO;
import com.example.connect_to_database_2.model.City;


public interface CityService {

    public City createCityFromDTO(CityDTO cityDTO);

//    City getCityWithName(String cityName);
}
