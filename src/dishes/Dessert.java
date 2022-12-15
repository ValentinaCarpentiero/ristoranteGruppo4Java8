package dishes;

import restaurant.Preferences;

/**
 * This class represents a Dessert and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Dessert extends Dish {

    private boolean glutenFree;

    //TODO prima i field statici, i field le liste il costruttore i metodi in overrride i getter e i setter e poi gli altri metodi


    /**
     * Dessert constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dessert name
     * @param dishType Dessert type
     * @param price Dessert price
     */

    //TODO i field da assegnare è meglio chiamarli con lo stesso nome altrimenti possiamo anche non mettere il this, quindi dessertIngredients
    public Dessert(String course, String dishName, Preferences dishType, double price, String ingredients, boolean glutenFree) {
        super(course, dishName,dishType, price, ingredients);
        this.glutenFree=glutenFree;

    }

    /**
     * Getter and Setter of the instance variable
     * @return boolean is glutenfree?
     */
    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
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
