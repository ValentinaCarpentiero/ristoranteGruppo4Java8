package restaurant;

import dishes.Dish;

import java.util.ArrayList;

public class Menu {

    private Preferences menuType;
    private ArrayList<Dish> dishList;

    public Menu(Preferences menuType) {
        this.dishList = new ArrayList<>();
        this.menuType = menuType;
    }

    public void addDish(Dish dish){
        dishList.add(dish);
    }
    public void removeDish(Dish dish){
        dishList.remove(dish);
    }

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

    public void printMenu(){
        System.out.println("Menu di " + this.menuType+" \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
            }
        }
    }
