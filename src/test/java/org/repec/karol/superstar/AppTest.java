package org.repec.karol.superstar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue()
    {

        // Given

        App app = new App();
        ArrayList<Dish> dishes = app.setDishList();
        String[] usersIinput = {"jajka","maslo","kielbasa"};


        // When

        ArrayList<Dish> dishListAfterLookup = app.lookup(dishes, app.userIngredients(usersIinput));

        // Then
        ArrayList<String> actual = new ArrayList<>();
        for (int i = 0; i < dishListAfterLookup.size(); i++) {
            actual.add(dishListAfterLookup.get(i).getName());
        }

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Jajecznica");



        assertEquals(expected, actual);
    }
}
