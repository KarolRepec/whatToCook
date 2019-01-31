package org.repec.karol.superstar;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Dish d = new Dish("New Dish");

        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "Name", " Dummy ingredient 1"));
        ingredients.add(new Ingredient(2, "Name 2", " Dummy ingredient 2"));
        ingredients.add(new Ingredient(3, "Name 3", " Dummy ingredient 3"));

        d.setIngrList(ingredients);

        // Lambda
        d.getIngredientsList()
                .forEach(ingredient -> System.out.println(ingredient.toString()));

        //For Each
        for (Ingredient t : d.getIngredientsList()) {
            System.out.println(t.toString());
        }
    }
}
