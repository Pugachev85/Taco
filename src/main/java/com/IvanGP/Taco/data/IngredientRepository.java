package com.IvanGP.Taco.data;

import com.IvanGP.Taco.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save (Ingredient ingredient);
}
