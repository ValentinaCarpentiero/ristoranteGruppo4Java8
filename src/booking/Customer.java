package booking;

import restaurant.Preferences;

/**
 * This class represents a Customer
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */

public class Customer {

    //TODO getter e setter? metodi per stampare informazioni del customer?(fatto) e altro da pensare!
    /**
     * /*This variable represent a customer id
     */
    private static int customerId = 0;
    private String fullName;
    private String email;
    private String telephoneNumber;
    private Preferences customerType;

    /**
     * Customer constructor that takes the following parameters:
     *
     * @param fullName        Customer name and surname
     * @param email           Customer email
     * @param telephoneNumber Customer telephone number
     * @param customerType    Customer's food preferences
     */

    public Customer(String fullName, String email, String telephoneNumber, Preferences customerType) {
        this.fullName = fullName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.customerType = customerType;
        customerId++;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Preferences getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Preferences customerType) {
        this.customerType = customerType;
    }

    /**
     * This is a method that prints the details of the customer
     */
    public void printCustomerDetails() {
        System.out.println ( "Name: " + this.fullName + " Email: " + this.email + " Telephone-number: " + this.telephoneNumber + " Preferences: " + this.customerType /*" -" + customerId++*/ );
    }
}
