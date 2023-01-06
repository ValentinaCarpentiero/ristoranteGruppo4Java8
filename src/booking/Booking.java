package booking;

import restaurant.Restaurant;

import java.time.LocalDateTime;
import java.util.Random;

public class Booking {
    private int bookingId;
    private int customerId;
    private Restaurant restaurant;
    private LocalDateTime bookingDate;
    private int groupSize;
    private String optionalMessage;


    /**
     * Booking constructor that takes the following parameters:
     *
     * @param restaurant      the restaurant where the booking was made
     * @param customerId      the unique identifier of the customer who made the booking
     * @param bookingDate     the date and time of the booking
     * @param groupSize       the number of people in the group for this booking
     * @param optionalMessage an optional message associated with this booking
     */


    public Booking(Restaurant restaurant, int customerId, LocalDateTime bookingDate, int groupSize, String optionalMessage) {
        this.restaurant = restaurant;
        this.customerId = customerId;
        this.bookingDate = bookingDate;
        this.groupSize = groupSize;
        this.optionalMessage = optionalMessage;
        this.bookingId = createRandomBookingId();
    }

    /**
     *The following methods are getters and setters for each variable
     */


    public long getBookingId() {
        return bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getOptionalMessage() {
        return optionalMessage;
    }

    public void setOptionalMessage(String optionalMessage) {
        this.optionalMessage = optionalMessage;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    /**
     * Generates and returns a random booking identifier.
     *
     * @return the random booking identifier
     */

    private int createRandomBookingId() {
        Random random = new Random();
        return random.nextInt(0, 500);
    }

    /**
     * This is a method that prints all the booking's details
     */

    public void printBookingDetails() {
        System.out.println("Booking nr." + getBookingId() +
                " - restaurant: " + restaurant.getRestaurantName() +
                " - customer Id: " + customerId +
                " - date: " + bookingDate +
                " - optional message: " + optionalMessage);
    }
}
