package me.viharev.struct.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Data
public class Recipe {
    private String nameRecipe;
    private Integer timeOfPreparing;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private List<String> stepList = new ArrayList<>();

}
