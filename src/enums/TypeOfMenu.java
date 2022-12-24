package enums;

public enum TypeOfMenu {
    SPECIAL("Special Menu"),
    CHILDREN("Children Menu"),
    TASTING("Menu of several bite-sized dishes"),
    DAILY("Menu of the day");

    private final String description;

    TypeOfMenu(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
