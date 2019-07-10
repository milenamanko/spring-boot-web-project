package com.milena.demo.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping("/dishes")
public class DishPresenter {

    @Autowired
    private DishProvider dishProvider;

    @GetMapping("/all")
    public String getDish(Model model) {
        List<Dish> dishesList = dishProvider.getDishes();

        model.addAttribute("dishesKey", dishesList);
        return "allDishes";

    }
}
