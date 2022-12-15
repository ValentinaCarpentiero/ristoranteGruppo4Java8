package restaurant;
/**
 * This enum is used as a common element for the Customer preferences and the Menu and Dish type
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public enum Preferences {
    CARNIVOROUS("Questo menù è di carne"),
    VEGETARIAN("Questo menù è vegetariano"),
    VEGAN("Questo menù è vegano"),
    MIXED("Menu misto");

    private final String description;

    Preferences(String descrption) {

        this.description = descrption;
    }

    public String getDescripition() {
        return description;
    }
}
