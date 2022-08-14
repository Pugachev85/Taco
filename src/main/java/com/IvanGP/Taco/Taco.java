package com.IvanGP.Taco;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=5, message="Name must be at last 5 characters long")
    private String name;

    @NotNull
    @Size(min=1, message="You must choose at last 1 ingredient")
    private List<Ingredient> ingredients;
}
