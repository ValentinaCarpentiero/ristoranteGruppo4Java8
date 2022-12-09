package restaurant;

import dishes.Dish;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList = new ArrayList<>();
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

    public void printMenu(){
        //System.out.println("restaurant.Menu di " + this.menuType+" \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
        }
    }
}
