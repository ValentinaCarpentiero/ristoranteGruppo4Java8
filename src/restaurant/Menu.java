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


    private Preferences menuPreferences;
    private BasedOn basedOn;
    private TypeOfMenu menuType;

    private boolean isMenuSpecial;
    private List<Dish> dishList;

    /**
     *
     * @param menuPreferences Type of special diets
     * @param menuType       Type of menu
     * @param basedOn        Menu base
     */
    public Menu(Preferences menuPreferences, TypeOfMenu menuType, BasedOn basedOn) {
        this.menuPreferences = menuPreferences;
        this.menuType = menuType;
        this.basedOn = basedOn;
        //TODO decidere se inizializzare la lista di menù di Restaurant nel costruttore come abbiamo fatto qui, creando anche i metodi add e remove qui
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

    public Preferences getMenuPreferences() {
        return menuPreferences;
    }

    public void setMenuPreferences(Preferences menuPreferences) {
        this.menuPreferences = menuPreferences;
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
                           +"\nDietary options: "+this.menuPreferences.toString().toLowerCase()+"\n"
                           );
        for (Dish dish : dishList) {
            dish.printDishDetail();
            System.out.println();
        }
    }
}
