package booking;

import restaurant.Preferences;

/**
 * This class represents a Customer
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */

public class Customer {

    private String fullName;
    private String email;
    private String telephoneNumber;
    /**
     * This variable represent a customer id
     */

    private static int customerId;
    private Preferences customerType;

    /**
     * Customer constructor that takes the following parameters:
     * @param fullName Customer name and surname
     * @param email Customer email
     * @param telephoneNumber Customer telephone number
     * @param customerType Customer's food preferences
     */

    public Customer(String fullName, String email, String telephoneNumber, Preferences customerType) {
        this.fullName = fullName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.customerType = customerType;
        customerId++;
    }
}
