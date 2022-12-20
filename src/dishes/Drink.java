package dishes;

import restaurant.Preferences;

/**
 * This class represents a drink and extends the Dish class
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Drink extends Dish {

    private double alcoholicVolume;
    private boolean isAlcoholic;

    /**
     * Alcoholic drink constructor that takes the following parameters:
     * @param course          Course type
     * @param drinkName       Drink name
     * @param drinkType       Drink type
     * @param price           Drink price
     * @param isAlcoholic     Boolean is alcoholic
     * @param alcoholicVolume Drink's alcohol content
     */
    public Drink(String course, String drinkName, Preferences drinkType, double price, boolean isAlcoholic, double alcoholicVolume) {
        super(course, drinkName, drinkType, price);
        this.isAlcoholic = isAlcoholic;
        this.alcoholicVolume = alcoholicVolume;
    }

    /**
     * Unalcoholic drink constructor that takes the following parameters:
     * @param course      Course type
     * @param drinkName   Drink name
     * @param drinkType   Drink type
     * @param price       Drink price
     *
    */
    public Drink(String course, String drinkName, Preferences drinkType, double price, boolean isAlcoholic) {
        super(course, drinkName, drinkType, price);
        this.isAlcoholic = false;
    }

    /**
     * Getter and Setter of each instance variable
     */
    public double getAlcoholicVolume() {
        return alcoholicVolume;
    }

    public void setAlcoholicVolume(double alcoholicVolume) {
        this.alcoholicVolume = alcoholicVolume;
    }

    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    /**
     * This is an override method from the Dish class that prints the details of the drink
     */
    @Override
    public void printDishDetail() {
        System.out.println("### "+super.getCourse()
                          +" ###"+"\n"+super.getDishName()
                           +"\n"+((this.isAlcoholic) ? "\nvol % : "+this.alcoholicVolume : "Unalcoholic drink")
                           +"\nPrice: "+this.getDishPrice());
    }
}
