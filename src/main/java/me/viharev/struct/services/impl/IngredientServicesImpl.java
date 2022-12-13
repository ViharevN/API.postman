package me.viharev.struct.services.impl;

import me.viharev.struct.models.Ingredient;
import me.viharev.struct.services.IngredientServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class IngredientServicesImpl implements IngredientServices {
    public static Integer id = 0;
    private Map<Integer, Ingredient> ingredientMap = new LinkedHashMap<>();
    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientMap.put(id, ingredient);
        id++;
    }

    @Override
    public Ingredient getIngredient(Integer id) {
        for (Ingredient value : ingredientMap.values()) {
            if (value != null) {
                return value;
            }
        }
        return null;
    }
    @Override
    public Ingredient editIngredient(Integer id, Ingredient ingredient) {
        for (Ingredient value : ingredientMap.values()) {
            if (ingredientMap.containsKey(id)) {
                ingredientMap.put(id, ingredient);
                return ingredient;
            }
        }
        return null;
    }

    @Override
    public boolean removeIngredient(Integer id) {
        for (Ingredient value : ingredientMap.values()) {
            if (ingredientMap.containsKey(id)) {
                ingredientMap.remove(id);
                return true;
            }
        }
        return false;
    }

    @Override
    public ResponseEntity<Ingredient> getIngredientById(Integer id) {
        for (Ingredient value : ingredientMap.values()) {
            if (ingredientMap.containsKey(id)) {
               return ResponseEntity.ok(value);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Ingredient> getAllIngredients() {
        for (Ingredient ingredient : ingredientMap.values()) {
            if (ingredient != null) {
                return ResponseEntity.ok(ingredient);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
