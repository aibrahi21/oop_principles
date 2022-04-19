package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

        /*
        create a fruit object and define below info
        taste = delicious;
        name = sushi
        isSpicy = true
        isOrganic = true

        First, print the name of the food
Then, print if the food is organic
Finally, print the object itself
         */

        Food food1 = new Food();
        food1.isSpicy = true;
        food1.name = "sushi";
        food1.setOrganic(true);
        food1.taste = "Delicious";
        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);
        /*
        Create a vegetable1 object and define below info for it
        taste = good
        name = parsley
        isSpicy = false
        isOrganic = true
        color = green

        First, print the name of the vegetable and color of the vegetable
        Then, print if the vegetable is organic
        Finally, print the object itself
         */
        System.out.println();
        Vegetable vegetable1 = new Vegetable();
        vegetable1.name = "Parsley";
        vegetable1.color = "green";
        vegetable1.isSpicy = false;
        vegetable1.taste = "good";
        vegetable1.setOrganic(true);
        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        System.out.println();
        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";
        System.out.println(vegetable2);

        /*
        I have one food object -> food1
        I have 2 vegetable objects -> parsley, broccoli

        Count and print how many elements in the list have a name that has more than 5 characters
         */
        System.out.println();
        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(vegetable1);
        allFoods.add(vegetable2);
        int count = 0;
        for (Food food : allFoods) {
            if (food.name.length() > 5){
                count++;
            }
        }
        System.out.println(count);
    }
}
