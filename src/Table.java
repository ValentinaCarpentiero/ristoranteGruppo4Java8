

public class Table {
    private int idTable;

    //TODO tipo di tavolo, interno, vista mare, ecc ecc
    private String typeOfTable;
    private boolean isAvailable;

    //LocalDate (Orario prenotazione)

    //TODO quanti posti abbiamo nel tavolo
    public Table(int idTable, String typeOfTable){
        this.idTable=idTable;
        this.typeOfTable=typeOfTable;
        this.isAvailable=true;
    }

    //TODO getter setter


}
