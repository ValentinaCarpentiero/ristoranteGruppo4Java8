package restaurant;
/**
 * This enum is used as a common element for the Customer preferences and the Menu and Dish type
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public enum Preferences {

    //TODO arricchiamo di informazioni
    CARNIVOROUS("Carnivoro"),
    VEGETARIAN,
    VEGAN,
    MIXED,
    ;

    private String carnivoro;

    Preferences(String carnivoro) {
        this.carnivoro = carnivoro;
    }
    public String getCarnivoro() {
        return carnivoro;
    }
}
