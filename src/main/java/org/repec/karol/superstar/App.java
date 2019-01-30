package org.repec.karol.superstar;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Dish newDish = new Dish(args[0]);
        newDish.setDish(args);
        System.out.println(newDish.getIngrList());
    }
}
