package booking;

import enums.Preferences;

/**
 * This class represents a Customer
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */

public class Customer {

    private String name;
    private String surname;
    private String telephoneNumber;
    private String email;
    private Preferences customerType;
    private int customerId;

    /**
     * Customer constructor that takes the following parameters:
     *
     * @param name            Customer name
     * @param surname         Customer surname
     * @param telephoneNumber Customer telephone number
     * @param email           Customer email
     * @param customerType    Customer's food preferences
     * @param customerId      Customer identification number
     */

    public Customer(String name, String surname, String telephoneNumber, String email, Preferences customerType, int customerId) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.customerId = customerId;
    }

    /**
     *The following methods are getters and setters for each variable
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Preferences getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Preferences customerType) {
        this.customerType = customerType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * This is a method that prints all the customer's details
     */
    public void printCustomerDetails() {
        System.out.println ("Customer ID "+this.customerId+"- Name: " + this.name +" Surname: "+this.surname+ " Telephone-number: " + this.telephoneNumber +" Email: " + this.email + " Preferences: " + this.customerType);
    }
}
