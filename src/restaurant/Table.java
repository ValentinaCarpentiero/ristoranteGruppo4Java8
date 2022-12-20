package restaurant;

import booking.Customer;

/**
 * This class represents a Table
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Table {

    /**
     * This enum provides the position of the table
     */
    public enum Type{
        INDOOR,
        OUTDOOR
    }

    private int idTable;
    private int seatsNumber;
    private Type type;
    private boolean isAvailable;


    /**
     * Table constructor that takes the following parameters and assigns the true value to the boolean isAvailable:
     * @param idTable     Table ID
     * @param seatsNumber Table's number of seats
     * @param type        Type of table
     */
    public Table(int idTable, int seatsNumber,Type type){
        this.idTable = idTable;
        this.seatsNumber = seatsNumber;
        this.type = type;
        this.isAvailable = true;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

