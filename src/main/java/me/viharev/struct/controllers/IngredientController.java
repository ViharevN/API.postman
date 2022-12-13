package me.viharev.struct.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.viharev.struct.models.Ingredient;
import me.viharev.struct.services.IngredientServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredients")
@AllArgsConstructor
@Data
public class IngredientController {
    private IngredientServices ingredientServices;

    @GetMapping("/add")
    public void addIngredient(@RequestParam Ingredient ingredient) {
        this.ingredientServices.addIngredient(ingredient);
    }

    @GetMapping("/get/{id}")
    public Ingredient getIngredient(@PathVariable Integer id) {
        return this.ingredientServices.getIngredient(id);
    }

    @PostMapping("/ingredient/add")
    public Ingredient addIngredientInMap(@RequestBody Ingredient ingredient) {
        this.ingredientServices.addIngredient(ingredient);
        return ingredient;
    }

    @PutMapping("/ingredient/edit/{id}")
    public Ingredient editIngredient(@PathVariable Integer id, @RequestBody Ingredient ingredient) {
        this.ingredientServices.editIngredient(id, ingredient);
        return ingredient;
    }

    @DeleteMapping("/ingredient/delete/{id}")
    public boolean deleteIngredient(@PathVariable Integer id) {
        if (this.ingredientServices.removeIngredient(id)) {
            return true;
        }
        return false;
    }
}
