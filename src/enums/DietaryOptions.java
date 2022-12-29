package enums;
/**
 * This enum provides the type of special diets
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */

public enum DietaryOptions {
    LACTOSE_INTOLERANCE ("Privo di lattosio"),
    GLUTEN_FREE("Privo di glutine"),
    NUT_ALLERGIES ("Privo di frutta a guscio"),
    LOCALLY_PRODUCED ("Produzione locale"),
    PEANUT_ALLERGY("Privo di arachidi"),
    FISH_ALLERGIES("Privo di pesci, crostacei e molluschi");

    private final String description;

    DietaryOptions(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
