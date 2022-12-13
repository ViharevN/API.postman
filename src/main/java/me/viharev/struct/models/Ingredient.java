package me.viharev.struct.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ingredient {
    private String nameIngredient;
    private Integer quantityOfIngredients;
    private String unit;
}
