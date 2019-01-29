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
        for (int i = 0; i < args.length; i++)
        {
            Ingredient args[i] = new Ingredient(i,args[i],args[i]);
        }
        System.out.println(List<Ingredient>.getIngrediends);
    }
}
