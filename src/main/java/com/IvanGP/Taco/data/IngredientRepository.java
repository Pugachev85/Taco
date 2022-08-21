package com.IvanGP.Taco.data;

import com.IvanGP.Taco.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
