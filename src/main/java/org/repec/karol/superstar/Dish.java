package org.repec.karol.superstar;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    List<Ingredient> ingrediends = new ArrayList<Ingredient>();

    public Dish() {
        ingrediends.add(new Ingredient());
    }

    public List<Ingredient> getIngrediends() {
        return ingrediends;
    }
}
