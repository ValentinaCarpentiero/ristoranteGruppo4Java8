package restaurant;

import dishes.Dish;

/**
 * This class represents a Restaurant
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Restaurant {
    private String restaurantName;
    private String address;
    private Menu menu;

    private boolean isOpen;
    /**
     * Restaurant constructor that takes the following parameters and assigns the true value to the boolean isOpen:
     * @param restaurantName Restaurant name
     * @param address Restaurant address
     * @param menu Restaurant menu
     */
    public Restaurant(String restaurantName, String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    public String getAddress() {
        return address;
    }


    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean open) {
        isOpen = open;
    }
    /**
     * This method prints each Dish's course
     */
    public void printMenu(){
        for (Dish dish : menu.getDishList()) {
            dish.printDishDetail();
        }

    }
}


