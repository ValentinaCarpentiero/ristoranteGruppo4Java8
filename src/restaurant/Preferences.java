package restaurant;
/**
 * This enum is used as a common element for the Customer preferences and the Menu and Dish type
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public enum Preferences {
    CARNIVOROUS("Questo menù è di carne"),
    VEGETARIAN,
    VEGAN,
    MIXED;

    private final String descripition;

    Preferences(String description) {

        this.descripition = description;
    }

    public String getDescripition() {
        return descripition;
    }
}
