package com.example.calorie;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DietTypes {
    private final Integer id;
    private final String name;
    private final Integer calorie;
    private final Type type;
    private final String recipe;
    public enum Type{
        PROTEIN, CARBS, FATS, VEGAN
    }
}
