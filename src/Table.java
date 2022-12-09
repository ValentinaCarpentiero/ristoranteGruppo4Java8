
public class Table {

    private int idTable;
    private int seatsNumber;
    private boolean isAvailable;


    public Table(int idTable, int seatsNumber){
        this.idTable=idTable;
        this.seatsNumber=seatsNumber;
        this.isAvailable=true;
    }

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

