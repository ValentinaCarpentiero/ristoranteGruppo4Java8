package dishes;

import restaurant.Preferences;

/**
 * This class represents a Dessert and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Dessert extends Dish {

    //TODO prima i field statici, i field le liste il costruttore i metodi in overrride i getter e i setter e poi gli altri metodi
    private String dessertIngredients;

    /**
     * Dessert constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dessert name
     * @param dishType Dessert type
     * @param price Dessert price
     */

    //TODO i field da assegnare è meglio chiamarli con lo stesso nome altrimenti possiamo anche non mettere il this, quindi dessertIngredients
    public Dessert(String course, String dishName, Preferences dishType, double price) {
        super(course, dishName,dishType, price);

    }

    /**
     * Getter and Setter
     * @return String with dessert ingredients
     */
    public String getDessertIngredients() {
        return dessertIngredients;
    }

    public void setDessertIngredients(String dessertIngredients) {
        this.dessertIngredients = dessertIngredients;
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
