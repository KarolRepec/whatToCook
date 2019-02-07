package org.repec.karol.superstar;

import java.util.ArrayList;
import java.util.List;

class Dish {
    private String name;
    private ArrayList<Ingredient> ingrList;

    Dish(String name) {
        this.name = name;
        ingrList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setIngrList(ArrayList<Ingredient> ingrList) {

        this.ingrList = ingrList;
    }

    void setDish(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Ingredient ingredient = new Ingredient(i, args[i], args[i]);
            ingrList.add(ingredient);
        }

    }

    List<Ingredient> getIngredientsList() {
        return ingrList;
    }


}
