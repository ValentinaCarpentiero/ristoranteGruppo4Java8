package restaurant;

import dishes.Dish;

import java.util.ArrayList;
/**
 * This class represents a Restaurant menu
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Menu {

    //TODO che nome ha il menù?(fatto) booleano per indicare il menù nei giorni di festa(fatto)
    private String menuName;
    private boolean isMenuSpecial;

    private Preferences menuType;
    private ArrayList<Dish> dishList;

    /**
     * Menu constructor that takes a parameter and initializes a dish list
     * @param menuType Type of menu
     */
    public Menu(String menuName, boolean isMenuSpecial, Preferences menuType) {
        this.menuName=menuName;
        this.isMenuSpecial=isMenuSpecial;
        this.dishList = new ArrayList<>();
        this.menuType = menuType;
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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public boolean isMenuSpecial() {
        return isMenuSpecial;
    }

    public void setMenuSpecial(boolean menuSpecial) {
        isMenuSpecial = menuSpecial;
    }

    /**
     *The following methods are getters and setters for each instance variables
     */


    public ArrayList<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    public Preferences getMenuType() {
        return menuType;
    }

    public void setMenuType(Preferences menuType) {
        this.menuType = menuType;
    }

    /**
     * This method prints each Dish's course
     */
    public void printMenu(){
        //TODO nome, e tutti i dettagli del menù
        System.out.println(this.menuType + " MENU " + " \n" + this.menuName + " \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
        }
    }
}
