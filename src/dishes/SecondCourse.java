package dishes;

import restaurant.Preferences;

/**
 * This class represents a second course and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class SecondCourse extends Dish {

    //variables


    /**
     * Second course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Second course name
     * @param dishType Second course type
     * @param price Second course price
     */

    public SecondCourse(String course, String dishName, Preferences dishType, double price, String ingredients) {
        super(course, dishName,dishType, price, ingredients);
    }

    /**
     * This is an override method from the Dish class that prints the details of the dish
     */
    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.getIngredients()+"\n");
    }
}
