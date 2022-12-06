

public class Table {

    protected enum TablePosition{
        INDOOR, OUTDOOR
    }
    private TablePosition tablePosition;
    private int idTable;
    private int seatsNumber;
    private boolean isAvailable;

    //LocalDate (Orario prenotazione)

    public Table(int idTable, int seatsNumber, TablePosition tablePosition){
        this.idTable=idTable;
        this.seatsNumber=seatsNumber;
        this.tablePosition=tablePosition;
        this.isAvailable=true;
    }
}
