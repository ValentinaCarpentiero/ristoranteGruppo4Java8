package booking;

import restaurant.Category;

public class Customer {
    private String fullName;
    private String email;
    private String telephoneNumber;
    private static int customerId;
    private Category customerType;


    public Customer(String fullName, String email, String telephoneNumber, Category customerType) {
        this.fullName = fullName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.customerType = customerType;
        customerId++;
    }
}
