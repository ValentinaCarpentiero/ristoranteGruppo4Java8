package booking;

import restaurant.Preferences;

public class Customer {
    private String fullName;
    private String email;
    private String telephoneNumber;
    private static int customerId;
    private Preferences customerType;


    public Customer(String fullName, String email, String telephoneNumber, Preferences customerType) {
        this.fullName = fullName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.customerType = customerType;
        customerId++;
    }
}
