package me.viharev.struct.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.viharev.struct.models.Recipe;
import me.viharev.struct.services.RecipeServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/recipe")
@AllArgsConstructor
@Data
public class RecipeController {
    private RecipeServices recipeServices;

    @PostMapping("/add")
    public ResponseEntity<Integer> addRecipe(@RequestBody Recipe recipe) {
        Integer id = recipeServices.addRecipe(recipe);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/get/{id}")
    public Recipe getRecipeById(@PathVariable Integer id) {
        ResponseEntity<Recipe> recipe = recipeServices.getRecipeById(id);
        if (recipe != null) {
            return recipe.getBody();
        }
        return null;
    }

    @PutMapping("/edit/{id}")
    public Recipe editRecipe(@PathVariable Integer id, @RequestBody Recipe recipe) {
        this.recipeServices.editRecipe(id, recipe);
        return recipe;
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteRecipe(@PathVariable Integer id) {
        if (this.recipeServices.removeRecipe(id)) {
            return true;
        }
        return false;
    }
}





