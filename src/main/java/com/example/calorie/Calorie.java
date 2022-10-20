package com.example.calorie;

import lombok.Data;

import java.util.List;

@Data
public class Calorie {
    private Integer calori;
    private List<DietTypes> diet;
}
