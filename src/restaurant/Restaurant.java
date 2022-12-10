package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantName;
    private String address;
    private List<Menu> menuList;
    private boolean isOpen;

    public Restaurant(String restaurantName, String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menuList = new ArrayList<>();
        this.isOpen = true;
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

    public List<Menu> getMenu() {
        return menuList;
    }

    public void setMenu(List<Menu> menu) {
        this.menuList = menu;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean open) {
        isOpen = open;
    }

    public void printMenu(){

        }
}


