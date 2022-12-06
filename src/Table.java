
public class Table {

    protected enum TablePosition{
        INDOOR, OUTDOOR
    }
    private int idTable;
    private int seatsNumber;
    private TablePosition tablePosition;
    private boolean isAvailable;


    public Table(int idTable, int seatsNumber, TablePosition tablePosition){
        this.idTable=idTable;
        this.seatsNumber=seatsNumber;
        this.tablePosition=tablePosition;
        this.isAvailable=true;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

