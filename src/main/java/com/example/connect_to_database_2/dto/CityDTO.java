package com.example.connect_to_database_2.dto;

import com.example.connect_to_database_2.model.City;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CityDTO {
    public String name;

    public long absolutePopulation;

    public static City toCity(CityDTO dto) {
        return City.builder().name(dto.name).absolutePopulation(dto.absolutePopulation).build();
    }

}
