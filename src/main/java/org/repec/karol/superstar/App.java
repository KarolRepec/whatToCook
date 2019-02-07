package org.repec.karol.superstar;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {

        App app = new App();
        app.lookup(app.setDishList(), app.userIngredients());

    }


    public ArrayList setDishList() {
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

        return dishList;

        //Lambda
//        nalesniki.getIngredientsList()
//                .forEach(ingredient -> System.out.println(ingredient.toString()));

        //For Each
//        for (Ingredient t : nalesniki.getIngredientsList()) {
//            System.out.println(t.toString());
//        }


    }

    public ArrayList userIngredients() {
        // Simulates user input

        ArrayList<String> myIngredients = new ArrayList<>();
        myIngredients.add("jajka");
        myIngredients.add("maslo");
        myIngredients.add("kielbasa");
        return myIngredients;
    }


    public ArrayList lookup(ArrayList<Dish> dishList, ArrayList<String> userIngredients){


        // Create collection of dishes that includes ingredients same as ones input by user
        ArrayList<Dish> matchedDishList = new ArrayList<Dish>();

        // iterate over dishList
        for (int i = 0; i < dishList.size(); i++) {

            //create temp arraylist
            ArrayList<String> dishIngredients = new ArrayList<>();

            //extract ingredients name from each dish in dishList and add them to temp array
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
        // Print result
        for (int i = 0; i < matchedDishList.size(); i++) {
            System.out.println(matchedDishList.get(i).getName());
        }


        return matchedDishList;
    }
}
