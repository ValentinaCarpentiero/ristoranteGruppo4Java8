package booking;

import restaurant.Restaurant;

import java.time.LocalDateTime;
import java.util.*;

public class BookingManager {

    private static BookingManager instance;

    private Map<LocalDateTime, Integer> capacityAvailable;
    private Map<Customer, Booking> bookingList;


    private BookingManager() {
        this.bookingList = new HashMap<>();
        this.capacityAvailable = new HashMap<>();
    }

    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public void createBooking(Customer customer, Restaurant restaurant, LocalDateTime bookingDate, int groupSize, String optionalMessage) {
        if (restaurant.getIsOpen() && getAvailableSeats(bookingDate, restaurant) >= groupSize) {
            Booking booking = new Booking(restaurant, customer.getCustomerId(), bookingDate, optionalMessage);

            System.out.println("Booking nr "+booking.getBookingId()+
                              " under the name "+customer.getName()+" "+customer.getSurname()+
                              " successfully done.");

            this.capacityAvailable.put(bookingDate, groupSize);
            this.bookingList.put(customer, booking);
        } else {
            System.out.println("No places available on date "+bookingDate);
        }
    }

    public void deleteBooking(Customer customer, LocalDateTime bookingDate) {
        if (bookingList.get(customer) != null) {
            Booking bookingToDelete = bookingList.get(customer);
            if (bookingToDelete.getBookingDate() == bookingDate) {
                bookingList.remove(customer);
                capacityAvailable.remove(bookingToDelete.getBookingDate());
                System.out.println("Booking nr "+bookingToDelete.getBookingId()+
                                  " under the name "+ customer.getSurname()+
                                  " on date "+ bookingToDelete.getBookingDate()+
                                  " deleted."
                );
            }else {
                System.out.println("Booking not found.");
            }
        }

    }


    private int getAvailableSeats(LocalDateTime time, Restaurant restaurant) {
        int availableTables = restaurant.getSeatingCapacity();
        if (this.capacityAvailable.containsKey(time)) {
            availableTables -= this.capacityAvailable.get(time);
        }
        return availableTables;
    }

    public void printBookingList(){
        System.out.println("BOOKING LIST.\nBookings present: "+bookingList.size());
        for (Map.Entry<Customer, Booking> entry : bookingList.entrySet()) {
            entry.getValue().printBookingDetails();
        }
    }

}
