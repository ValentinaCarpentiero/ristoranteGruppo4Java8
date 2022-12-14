package dishes;

import restaurant.Preferences;

/**
 * This class represents a first course and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */

public class FirstCourse extends Dish {

    //TODO setter, ingredients può essere a comune?

    /**
     * First course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName First Course name
     * @param dishType First Course type
     * @param price First Course price
     * @param ingredients Dish ingredients
     */

    public FirstCourse(String course, String dishName, Preferences dishType, double price, String ingredients){
        super(course, dishName,dishType, price,ingredients);

    }

    /**
     * This is an override method from the Dish class that prints the details of the dish
     */
    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.getIngredients() +"\n");
    }
}



