package restaurant;

public class Restaurant {
    private String restaurantName;
    private String address;
    private Menu menu;
    private boolean isOpen;

    public Restaurant(String restaurantName, String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu ;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean open) {
        isOpen = open;
    }

}


