package restaurant;

import booking.Booking;
import booking.Customer;
import enums.TablePosition;
import enums.TableService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Restaurant
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Restaurant {

    private static Integer idTavolo = 0;

    private String restaurantName;
    private String address;
    private boolean isOpen;
    private int seatingCapacity;
    private double averagePrice;
    private String recommendedDish;
    private TableService tableService;
    private String services;
    private boolean hasHomeDelivery;
    private boolean hasAllYouCanEat;
    private List<Menu> menu;
    private List<Customer> customerList = new ArrayList<>();
    private List<Booking> bookingList = new ArrayList<> ();
    private List<Table> tableList = new ArrayList<>();

    private LocalDateTime today = LocalDateTime.now();


    /**
     * Restaurant constructor that takes the following parameters:
     * @param restaurantName  Restaurant name
     * @param address         Restaurant address
     * @param menu            Restaurant menu list
     * @param recommendedDish Restaurant chef's choice
     * @param seatingCapacity Restaurant seating capacity
     * @param tableService    Restaurant plates service
     * @param averagePrice    Restaurant average bill's cost
     * @param services        Restaurant's services
     * @param hasHomeDelivery Boolean about restaurant's delivery
     * @param hasAllYouCanEat Boolean about restaurant all-you-can-eat form
     */

    public Restaurant(String restaurantName, String address, List<Menu> menu, String recommendedDish,int seatingCapacity, TableService tableService, double averagePrice, String services, boolean hasHomeDelivery, boolean hasAllYouCanEat) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
        this.averagePrice = averagePrice;
        this.recommendedDish = recommendedDish;
        this.seatingCapacity = seatingCapacity;
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

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
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
            if (singleMenu.getMenuPreferences() == customer.getCustomerPreferences()) {
                singleMenu.printMenu();
            }
        }
    }

    public void prenotation(Customer customer) {
        if (tableList.size () < seatingCapacity) {
            Table table = new Table ( idTavolo, customer.getGroupSize (), TablePosition.INDOOR );
            tableList.add ( table );
            customerList.add ( customer );
            idTavolo++;
            Booking booking = new Booking(customer.getCustomerId(),today,customer.getGroupSize());
            bookingList.add(booking);
            System.out.println ("A new prenotation was created");
            booking.printBookingDetails();
        }
    }


    public void payCount(Customer customer){
        customerList.remove(customer);
    }
}




