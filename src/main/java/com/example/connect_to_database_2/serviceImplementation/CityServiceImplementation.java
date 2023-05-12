package com.example.connect_to_database_2.serviceImplementation;

import com.example.connect_to_database_2.dto.CityDTO;
import com.example.connect_to_database_2.model.City;
import com.example.connect_to_database_2.repository.CityRepository;
import com.example.connect_to_database_2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImplementation implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public City getCityWithName(String cityName) {
        return cityRepository.findByName(cityName);
    }

    @Override
    public City createCityFromDTO(CityDTO cityDTO) {
        City city = CityDTO.toCity(cityDTO);
        long absolutePopulation = city.getAbsolutePopulation();
        city.setPopulationInMillions((long) (absolutePopulation / 1e6));
        cityRepository.save(city);
        return city;
    }

}