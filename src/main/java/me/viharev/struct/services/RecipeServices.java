package me.viharev.struct.services;

import me.viharev.struct.models.Recipe;
import org.springframework.http.ResponseEntity;

public interface RecipeServices {
    public Integer addRecipe(Recipe recipe);

    public void getRecipe();

    ResponseEntity<Recipe> getRecipeById(Integer idRecipe);

    Recipe editRecipe(Integer idRecipe, Recipe recipe);

    boolean removeRecipe(Integer idRecipe);
}
