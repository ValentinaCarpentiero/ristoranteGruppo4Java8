package dishes;

import restaurant.Preferences;

/**
 * This class represents a drink and extends the Dish class
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Drink extends Dish {

    private int alcoholicVolume;

    /**
     * First course constructor that takes the following parameters:
     * @param course          Course type
     * @param dishName        Drink name
     * @param dishType        Drink type
     * @param price           Drink price
     * @param alcoholicVolume Drink's alcohol content
     */
    public Drink(String course, String dishName, Preferences dishType, double price, int alcoholicVolume) {
        super(course, dishName, dishType, price);
        this.alcoholicVolume = alcoholicVolume;
    }
    /**
     * Getter and Setter of the variable
     */
    public int getAlcoholicVolume() {
        return alcoholicVolume;
    }

    public void setAlcoholicVolume(int alcoholicVolume) {
        this.alcoholicVolume = alcoholicVolume;
    }

    /**
     * This is an override method from the Dish class that prints the details of the drink
     */
    @Override
    public void printDishDetail() {
        System.out.println("### "+super.getCourse()
                +" ###"+"\n"+super.getDishName()
                +"\nvol % : "+this.alcoholicVolume
                +"\nPrice: "+this.getDishPrice());
    }
}
