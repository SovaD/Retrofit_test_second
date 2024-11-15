package com.example.retrofit_test.entities;

import java.util.List;

import kotlin.jvm.internal.FloatSpreadBuilder;

public class Recipe {
    int id;
    String name;
    List<String> ingredients;
    List<String> instructions;
    String cuisine;
    String image;
    float rating;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getImage() {
        return image;
    }

    public float getRating() {
        return rating;
    }
}
