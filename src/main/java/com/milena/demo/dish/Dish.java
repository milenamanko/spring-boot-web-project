package com.milena.demo.dish;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private List<Ingredient> ingredients;
    private double kcal;
    private double prepTime;
    private DishType type;
}
