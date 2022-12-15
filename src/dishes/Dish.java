package dishes;

import restaurant.Preferences;

/**
 * This class represents a general Dish
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Dish {
    private double dishPrice;
    private String dishName;
    private String course;
    private String ingredients;
    private Preferences dishType;

    /**
     * First course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dish name
     * @param dishType Dish type
     * @param dishPrice Dish price
     */
    public Dish(String course,String dishName, Preferences dishType, double dishPrice){
        this.course=course;
        this.dishName=dishName;
        this.dishType=dishType;
        this.dishPrice=dishPrice;
    }

    /**
     * First course constructor that takes the following parameters:
     * @param course Course type
     * @param dishName Dish name
     * @param dishType Dish type
     * @param dishPrice Dish price
     * @param ingredients Dish ingredients
     */

    public Dish(String course, String dishName,Preferences dishType, double dishPrice,String ingredients){
        this.dishPrice = dishPrice;
        this.dishName = dishName;
        this.dishType = dishType;
        this.course = course;
        this.ingredients=ingredients;
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

    /**
     * This is a method that prints the details of the dish that will be overridden
     */
    public void printDishDetail() {
        System.out.println("### "+this.course +" ###"+"\n"+this.dishName+"\nPrezzo: "+this.dishPrice + "€ ");
    }
}
