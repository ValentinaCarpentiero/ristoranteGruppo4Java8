package dishes;

import restaurant.Preferences;

/**
 * This class represents a drink and extends the Dish class
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Drink extends Dish {

    private String typeOfDrink;
    /**
     * First course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Drink name
     * @param dishType Drink type (MIXED from Preferences ENUM)
     * @param price Drink price
     * @param typeOfDrink Drink type
     */
    public Drink(String course, String dishName, Preferences dishType, double price, String typeOfDrink) {
        super(course, dishName, dishType,price);
        this.typeOfDrink = typeOfDrink;
    }
    /**
     * This is a getter that returns the ingredients
     * @return String with second course ingredients
     */
    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    /**
     * This is an override method from the Dish class that prints the details of the dish
     */
    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Tipo : "+this.typeOfDrink+"\n");
    }
}
