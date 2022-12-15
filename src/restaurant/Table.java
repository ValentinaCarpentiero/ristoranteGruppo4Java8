package restaurant;

import booking.Customer;

/**
 * This class represents a Table
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Table {

    private int idTable;
    private int seatsNumber;
    private boolean isAvailable;


    /**
     * Table constructor that takes the following parameters and assigns the true value to the boolean isAvailable:
     * @param idTable Restaurant name
     * @param seatsNumber Restaurant address
     */
    public Table(int idTable, int seatsNumber){
        this.idTable=idTable;
        this.seatsNumber=seatsNumber;
        this.isAvailable=true;
    }
    /**
     *The following methods are getters and setters for each instance variables
     */
    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
}

