package me.viharev.struct.services;

import me.viharev.struct.models.Ingredient;
import org.springframework.http.ResponseEntity;

public interface IngredientServices {
    public void addIngredient(Ingredient ingredient);

    public Ingredient getIngredient(Integer id);

    Ingredient editIngredient(Integer id, Ingredient ingredient);

    boolean removeIngredient(Integer id);

    ResponseEntity<Ingredient> getIngredientById(Integer id);

    ResponseEntity<Ingredient> getAllIngredients();
}
