package restaurant;

import booking.Customer;
import dishes.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a Restaurant
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Restaurant {
    /**
     * This enum describes how restaurant serves dishes
     * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
     */

    public enum TableService {
        BUFFET ("Buffet"),
        A_LA_CARTE ("A la carte");

        private final String description;

        TableService(String description) {

            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }
    private String restaurantName;
    private String address;
    private List<Menu> menu;
    private boolean isOpen;
    private double averagePrice;
    private String recommendedDish;
    private TableService tableService;
    private String services;
    private boolean hasHomeDelivery;
    private boolean hasAllYouCanEat;

    /**
     * Restaurant constructor that takes the following parameters:
     * @param restaurantName  Restaurant name
     * @param address         Restaurant address
     * @param menu            Restaurant menu list
     * @param recommendedDish Chef's choice
     * @param tableService    How plates are served
     * @param averagePrice    Average bill's cost
     * @param services        Restaurant's services
     * @param hasHomeDelivery Restaurant's delivery
     * @param hasAllYouCanEat Restaurant all-you-can-eat form
     */

    public Restaurant(String restaurantName, String address, List<Menu> menu, String recommendedDish, TableService tableService, double averagePrice, String services, boolean hasHomeDelivery, boolean hasAllYouCanEat) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
        this.averagePrice = averagePrice;
        this.recommendedDish = recommendedDish;
        this.tableService = tableService;
        this.services = services;
        this.hasHomeDelivery = hasHomeDelivery;
        this.hasAllYouCanEat = hasAllYouCanEat;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getRecommendedDish() {
        return recommendedDish;
    }

    public void setRecommendedDish(String recommendedDish) {
        this.recommendedDish = recommendedDish;
    }

    public TableService getTableService() {
        return tableService;
    }

    public void setTableService(TableService tableService) {
        this.tableService = tableService;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public boolean isHasHomeDelivery() {
        return hasHomeDelivery;
    }

    public void setHasHomeDelivery(boolean hasHomeDelivery) {
        this.hasHomeDelivery = hasHomeDelivery;
    }

    public boolean isHasAllYouCanEat() {
        return hasAllYouCanEat;
    }

    public void setHasAllYouCanEat(boolean hasAllYouCanEat) {
        this.hasAllYouCanEat = hasAllYouCanEat;
    }

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
     * This is a method that prints the details of the restaurant
     */

    public void printRestaurantDetails(){
        System.out.println(this.restaurantName
                          +"\nAddress: "+ this.address
                          +"\nAverage Price: "+ this.averagePrice
                          +"\nChef's choice: "+ this.recommendedDish
                          +"\nTable service: "+ this.tableService.getDescription()
                          +"\nServices: "+ this.services
                          );
        System.out.println("All you can eat: " + (hasAllYouCanEat ? "Yes" : "No"));
        System.out.println("Home delivery: " + (hasHomeDelivery ? "Yes" : "No"));
    }

    /**
     * This method prints each Menu from List<Menu> in relations to the preferences
     * @param customer provides the customer's preferences to compare with the menu type
     */

    public void printMenu(Customer customer) {
        for (Menu singleMenu : menu){
            if (singleMenu.getDietaryOptions() == customer.getCustomerType()) {
                singleMenu.printMenu();
            }
        }
    }
}




