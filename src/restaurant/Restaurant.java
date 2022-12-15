package restaurant;

import booking.Customer;
import dishes.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a Restaurant
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Restaurant {
    private String restaurantName;
    private String address;
    private List<Menu> menu;
    private boolean isOpen;

    /**
     * Restaurant constructor that takes the following parameters and assigns the true value to the boolean isOpen:
     *
     * @param restaurantName Restaurant name
     * @param address        Restaurant address
     * @param menu           Restaurant menu List
     */
    public Restaurant(String restaurantName, String address, List<Menu> menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */
    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getIsOpen(){
        return isOpen;
    }


    public void setIsOpen(boolean open){
        isOpen = open;
    }

    /**
     * This method prints each Menu in a List<Menu> for preferences
     * @param customer need to compare and print  if the preferences of single menu and customer are equals
     */

    public void printMenu(Customer customer) {
        for (Menu singleMenu : menu){
            if (singleMenu.getMenuType() == customer.getCustomerType()) {
                singleMenu.printMenu();
            }
        }
    }
}




