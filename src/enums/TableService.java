package enums;

public enum TableService {
    BUFFET ("Buffet"),
    A_LA_CARTE ("À la carte");

    private final String description;

    TableService(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
