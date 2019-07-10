package com.milena.demo.dish;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ingredient {

    private String name;
    private Long quantity;
}
