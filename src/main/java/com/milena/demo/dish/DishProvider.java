package com.milena.demo.dish;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DishProvider {

    private Map<Long, Dish> dishMap = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Ingredient batat = new Ingredient("batat", 400L);
        Ingredient sol = new Ingredient("sol", 1L);

        List<Ingredient> ingredientList = new ArrayList<>();

        ingredientList.add(batat);
        ingredientList.add(sol);

        Dish dish = new Dish("frytki z batata", ingredientList, 400.00, 40, DishType.DINNER);

        dishMap.put(1L, dish);
    }

    public Dish getbyId(Long id) {
        return dishMap.get(id);
    }

    public List<Dish> getDishes() {
        return new ArrayList<>(dishMap.values());
    }
}
