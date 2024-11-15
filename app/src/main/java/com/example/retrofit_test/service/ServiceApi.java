package com.example.retrofit_test.service;


import com.example.retrofit_test.entities.Recipe;
import com.example.retrofit_test.entities.RecipeList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {
    @GET("recipes")
    Call<RecipeList> getRecipes();
}
