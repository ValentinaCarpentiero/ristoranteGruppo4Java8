package dishes;

import restaurant.Preferences;

/**
 * This class represents a Dessert and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Dessert extends Dish {
    private String dessertIngredients;

    /**
     * Dessert constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dessert name
     * @param dishType Dessert type
     * @param price Dessert price
     * @param ingredients Dessert ingredients
     */
    public Dessert(String course, String dishName, Preferences dishType, double price, String ingredients) {
        super(course, dishName,dishType, price);
        this.dessertIngredients = ingredients;
    }

    /**
     * This is a getter that returns the ingredients
     * @return String with dessert ingredients
     */
    public String getDessertIngredients() {
        return dessertIngredients;
    }

    /**
     * This is an override method from the Dish class that prints the details of the dish
     */
    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.dessertIngredients+"\n");
    }

}
