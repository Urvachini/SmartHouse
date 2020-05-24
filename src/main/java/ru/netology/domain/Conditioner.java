package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Conditioner {
    private int id;
    private String name = "Subzero";
    private int maxTemperature = 32;
    private int minTemperature = 10;
    private int currentTemperature = 22;
    private boolean on;

}


