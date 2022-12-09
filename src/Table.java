
public class Table {

    private int idTable;
    private int seatsNumber;
    private boolean isAvailable;


    public Table(int idTable, int seatsNumber){
        this.idTable=idTable;
        this.seatsNumber=seatsNumber;
        this.isAvailable=true;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

