package booking;

import restaurant.Restaurant;

import java.time.LocalDateTime;
import java.util.Random;

public class Booking {
    private int bookingId;
    private int customerId;
    private Restaurant restaurant;
    private LocalDateTime bookingDate;
    private String optionalMessage;

    public Booking(Restaurant restaurant, int customerId, LocalDateTime bookingDate, String optionalMessage) {
        this.restaurant = restaurant;
        this.customerId = customerId;
        this.bookingDate = bookingDate;
        this.optionalMessage = optionalMessage;
        this.bookingId = createRandomBookingId();
    }

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

    /**
     * This is a method that creates a random booking ID
     *
     * @return random id
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
