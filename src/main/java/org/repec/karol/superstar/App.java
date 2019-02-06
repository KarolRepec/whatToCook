package org.repec.karol.superstar;

import java.util.ArrayList;
import java.util.Objects;

public class App {
    public static void main(String[] args) {


        // Create dishList

        ArrayList<Dish> dishList = new ArrayList<Dish>();

        // Create dish and add it to dishList
        Dish jajecznica = new Dish("Jajecznica");

        ArrayList<Ingredient> ingredientsJajecznica = new ArrayList<>();
        ingredientsJajecznica.add(new Ingredient(1, "jajka", " najlepiej wiejskie ale obsrane z tesco tez obejda"));
        ingredientsJajecznica.add(new Ingredient(2, "maslo", " do smarzenia na patelni, nie do chleba debilu"));
        ingredientsJajecznica.add(new Ingredient(3, "kielbasa", " no bo jak tak bez kielby..."));

        jajecznica.setIngrList(ingredientsJajecznica);
        dishList.add(jajecznica);


        // Create dish and add it to dishList
        Dish risotto = new Dish("risoto z grzybami");

        ArrayList<Ingredient> ingredientsRisotto = new ArrayList<>();
        ingredientsRisotto.add(new Ingredient(1, "ryz", " wystarczy praboiled"));
        ingredientsRisotto.add(new Ingredient(2, "maslo", " do smarzenia na patelni, nie do chleba debilu"));
        ingredientsRisotto.add(new Ingredient(3, "grzyby", " to Ci dopiero zaskoczenie..."));

        risotto.setIngrList(ingredientsRisotto);
        dishList.add(risotto);

        // Create dish and add it to dishList
        Dish nalesniki = new Dish("nalesniki");

        ArrayList<Ingredient> ingredientsNalesniki = new ArrayList<>();
        ingredientsNalesniki.add(new Ingredient(1, "jajka", " najlepiej wiejskie ale obsrane z tesco tez obejda"));
        ingredientsNalesniki.add(new Ingredient(2, "mąka", " taka biała się nada"));
        ingredientsNalesniki.add(new Ingredient(3, "mleko", " takie białe się nada"));

        nalesniki.setIngrList(ingredientsNalesniki);
        dishList.add(nalesniki);

        // Create dish and add it to dishList
        Dish spagetti = new Dish("spagetti");

        ArrayList<Ingredient> ingredientsSpagetti = new ArrayList<>();
        ingredientsSpagetti.add(new Ingredient(1, "makaron", " jak nazwa wskazuje najlepszy byłby spagetti"));
        ingredientsSpagetti.add(new Ingredient(2, "mięso mielone", " bo bez mięsa się nie da"));
        ingredientsSpagetti.add(new Ingredient(3, "pomidory", " jak nie masz 'żywych' to obejdą z puszki"));

        spagetti.setIngrList(ingredientsSpagetti);
        dishList.add(spagetti);


        // Create ingredient list simulating user's input

        ArrayList<String> myIngredients = new ArrayList<>();
        myIngredients.add("jajka");
        myIngredients.add("maslo");
        myIngredients.add("kielbasa");


        // Run lookup method


        ArrayList<Dish> newDishList = lookup(dishList, myIngredients);


        // test lookup metchod

        for (int i = 0; i < newDishList.size(); i++) {

            for (Ingredient t : dishList.get(i).getIngredientsList()) {
                System.out.println(t);
            }
        }


        //Lambda
//        nalesniki.getIngredientsList()
//                .forEach(ingredient -> System.out.println(ingredient.toString()));

        //For Each
//        for (Ingredient t : nalesniki.getIngredientsList()) {
//            System.out.println(t.toString());
//        }


        // Create lookup method. Inputs are dishlist and list of ingredients input by user
    }
    public static ArrayList lookup(ArrayList<Dish> dishList, ArrayList<String> userIngredients){


        // Create collection of dishes that includes ingredients same as ones input by user
        ArrayList<Dish> matchedDishList = new ArrayList<Dish>();

        // iterate over dishList
        for (int i = 0; i < dishList.size(); i++) {

            //create temp arraylist
            ArrayList<String> dishIngredients = new ArrayList<>();

            //extract ingredients name from form each dish in dishList and add them to temp array
            for (Ingredient t : dishList.get(i).getIngredientsList()) {
                dishIngredients.add(t.getName());
            }

            // increase matchCount by 1 if ingredient input by user exists in dish
            int matchCount = 0;
            for (int j = 0; j < userIngredients.size(); j++) {

                int position = dishIngredients.indexOf(userIngredients.get(j));
                if (position >= 0) {
                    matchCount++;
                }
            }

            // if all ingredients input by user exists in Dish, add dish to matchDishList
            if (matchCount == userIngredients.size()) {
                matchedDishList.add(dishList.get(i));
            }

        }
        return matchedDishList;
    }
}
