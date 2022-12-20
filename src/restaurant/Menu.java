package restaurant;

import dishes.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Restaurant menu
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Menu {

    /**
     * This enum describes the base of the menu
     */
    public enum BasedOn{
        FISH,
        MEAT,
        VEGETABLES
    }
    /**
     * This enum describes the type of menu
     */
    public enum Type {
        SPECIAL("Special Menu"),
        CHILDREN("Children Menu"),
        TASTING("Menu of several bite-sized dishes"),
        DAILY("Menu of the day");

        private final String description;

        Type(String description) {

            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private Preferences dietaryOptions;
    private BasedOn basedOn;
    private Type menuType;
    private boolean isMenuSpecial;
    private List<Dish> dishList;

    /**
     *
     * @param dietaryOptions type of special diets
     * @param menuType       type of menu
     * @param basedOn        menu base
     * @param isMenuSpecial  special menu
     */
    public Menu(Preferences dietaryOptions, Type menuType, BasedOn basedOn, boolean isMenuSpecial) {
        this.dietaryOptions = dietaryOptions;
        this.menuType = menuType;
        this.basedOn = basedOn;
        this.isMenuSpecial = isMenuSpecial;
        this.dishList = new ArrayList<>();
    }

    /**
     *The following methods are getters and setters for each instance variables
     */

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public Type getMenuType() {
        return menuType;
    }

    public void setMenuType(Type menuType) {
        this.menuType = menuType;
    }

    public boolean getIsMenuSpecial() {
        return isMenuSpecial;
    }

    public void setIsMenuSpecial(boolean menuSpecial) {
        isMenuSpecial = menuSpecial;
    }


    public Preferences getDietaryOptions() {
        return dietaryOptions;
    }

    public void setDietaryOptions(Preferences dietaryOptions) {
        this.dietaryOptions = dietaryOptions;
    }

    public BasedOn getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(BasedOn basedOn) {
        this.basedOn = basedOn;
    }

    /**
     * This method add a dish to the dish list and takes a parameter
     * @param dish dish to add
     */

    public void addDish(Dish dish){
        dishList.add(dish);
    }

    /**
     * This method remove a dish to the dish list and takes a parameter
     * @param dish dish to remove
     */

    public void removeDish(Dish dish){
        dishList.remove(dish);
    }

    /**
     * This method prints all menu's details and each dish
     */

    public void printMenu(){
        System.out.println(this.menuType
                           +"\n"+ this.menuType.getDescription()
                           +"\nMenu based on "+this.basedOn.toString().toLowerCase()
                           +"\nDietary options: "+this.dietaryOptions.toString().toLowerCase()+"\n"
                           );
        for (Dish dish : dishList) {
            dish.printDishDetail();
            System.out.println();
        }
    }
}
