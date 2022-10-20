package com.example.calorie;

import java.util.*;

public class CalorieCalck {
    private Integer age;
    private Gen gender;
    public enum Gen{
        MALE, FEMALE
    }
    private Integer weight;
    private Integer growth;
    private act activity;
    public enum act{
        MINIMUM, NORMAL, INTENSIVE
    }
    private List<Calorie> calories = new ArrayList<>();
    public void addCalori(Calorie calorie){
        this.calories.add(calorie);
    }
}
