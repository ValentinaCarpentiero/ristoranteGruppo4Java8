package restaurant;

import dishes.Dish;
import enums.BasedOn;
import enums.Preferences;
import enums.TypeOfMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Restaurant menu
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Menu {


    private Preferences dietaryOptions;
    private BasedOn basedOn;
    private TypeOfMenu menuType;

    private boolean isMenuSpecial;
    private List<Dish> dishList;

    /**
     *
     * @param dietaryOptions Type of special diets
     * @param menuType       Type of menu
     * @param basedOn        Menu base
     */
    public Menu(Preferences dietaryOptions, TypeOfMenu menuType, BasedOn basedOn) {
        this.dietaryOptions = dietaryOptions;
        this.menuType = menuType;
        this.basedOn = basedOn;
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

    public TypeOfMenu getMenuType() {
        return menuType;
    }

    public void setMenuType(TypeOfMenu menuType) {
        this.menuType = menuType;
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
