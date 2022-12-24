package dishes;

import enums.Preferences;

/**
 * This class represents a general Dish
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Dish {

    /**
     * This enum provides type of special diets
     */

    //TODO facciamo una classe apposita? e ci mettiamo la descrizione e altri parametri d'info ?
    public enum DietaryOptions{
        LACTOSE_INTOLERANCE,
        GLUTEN_FREE,
        NUT_ALLERGIES,
        LOCALLY_PRODUCED,
        PEANUT_ALLERGY,
        FISH_ALLERGIES
    }

    private double dishPrice;
    private String dishName;
    private String course;
    private String ingredients;
    private Preferences dishType;
    private DietaryOptions dietaryOptions;

    /**
     * Dish constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dish name
     * @param dishType Dish type
     * @param dishPrice Dish price
     */
    public Dish(String course,String dishName, Preferences dishType, double dishPrice){
        this.course = course;
        this.dishName = dishName;
        this.dishType = dishType;
        this.dishPrice = dishPrice;
    }

    /**
     * Dish  overloaded constructor that takes this different parameter:
     * @param dietaryOptions enums.Type of special diets
     * @param ingredients    Dish ingredients
     */
    //TODO siamo sicuri di fare due costruttori?
    public Dish(String course, String dishName,Preferences dishType, DietaryOptions dietaryOptions, double dishPrice,String ingredients){
        this.dishPrice = dishPrice;
        this.dishName = dishName;
        this.dishType = dishType;
        this.course = course;
        this.dietaryOptions = dietaryOptions;
        this.ingredients = ingredients;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */
    public double getDishPrice() {
        return dishPrice;
    }
    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Preferences getDishType() {
        return dishType;
    }

    public void setDishType(Preferences dishType) {
        this.dishType = dishType;
    }

    public DietaryOptions getDietaryOptions() {
        return dietaryOptions;
    }

    public void setDietaryOptions(DietaryOptions dietaryOptions) {
        this.dietaryOptions = dietaryOptions;
    }

    /**
     * This is a method that prints the details of the dish that will be overridden
     */
    public void printDishDetail() {
        System.out.println("### "+this.course
                          +" ###"+"\n"+this.dishName
                          +"\nIngredients: "+this.ingredients
                          +"\nDietary options: "+this.dietaryOptions
                          +"\nPrice: "+this.dishPrice+ "€");
    }
}
