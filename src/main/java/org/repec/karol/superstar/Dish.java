package org.repec.karol.superstar;

import java.util.ArrayList;

public class Dish
{
    String name;
    ArrayList<Ingredient> ingrList;

    public Dish(String name)
    {
        this.name = name;
        ingrList = new ArrayList<Ingredient>();
    }

    public void setDish( String[] args )
    {
        for (int i = 1; i < args.length; i++) {
                Ingredient ingredient = new Ingredient(i, args[i], args[i]);
                ingrList.add(ingredient);
        }

    }

    public ArrayList<Ingredient> getIngrList()
    {
        return ingrList;
    }

}
