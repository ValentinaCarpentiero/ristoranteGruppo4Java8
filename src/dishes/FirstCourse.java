package dishes;

import restaurant.Preferences;

/**
 * This class represents a first course and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */

public class FirstCourse extends Dish {

    private String firstIngredients;

    /**
     * First course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName First Course name
     * @param dishType First Course type
     * @param price First Course price
     * @param firstIngredients Dish ingredients
     */

    public FirstCourse(String course, String dishName, Preferences dishType, double price, String firstIngredients) {
        super(course, dishName,dishType, price);
        this.firstIngredients = firstIngredients;
    }
    /**
     * This is a getter that returns the ingredients
     * @return String with first course ingredients
     */
    public String getFirstIngredients() {
        return firstIngredients;
    }

    /**
     * This is an override method from the Dish class that prints the details of the dish
     */
    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.firstIngredients +"\n");
    }
}



