package restaurant;

import dishes.Dish;


public class Restaurant {
    private String restaurantName;
    private String address;
    private Menu menu;

    private boolean isOpen;

    public Restaurant(String restaurantName, String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
    }

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

    public void printMenu(){
        for (Dish dish : menu.getDishList()) {
            dish.printDishDetail();
        }

    }
}


