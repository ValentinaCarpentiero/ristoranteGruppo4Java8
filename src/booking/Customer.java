package booking;

import restaurant.Preferences;

/**
 * This class represents a Customer
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */

public class Customer {

    //TODO getter e setter? metodi per stampare informazioni del customer? e altro da pensare!
    /**
    /*This variable represent a customer id
    */
    private static int customerId = 0;
    private String fullName;
    private String email;
    private String telephoneNumber;
    private Preferences customerType;

    /**
     * Customer constructor that takes the following parameters:
     * @param fullName Customer name and surname
     * @param email Customer email
     * @param telephoneNumber Customer telephone number
     * @param customerType Customer's food preferences
     */

    //TODO nome cognome telefono email e customerid
    public Customer(String fullName, String email, String telephoneNumber, Preferences customerType) {
        this.fullName = fullName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.customerType = customerType;
        customerId++;
    }

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
}
