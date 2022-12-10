package restaurant;

import dishes.Dish;

import java.util.ArrayList;

public class Menu {
     public enum BasedOn{
        FISH, MEAT, VEGETABLE
    }
    private Enum menuType;
    private BasedOn base;
    private ArrayList<Dish> dishList;

    public Menu(Enum menuType,BasedOn base) {
        this.dishList = new ArrayList<>();
        this.base = base;
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

    public void printMenu(){
        System.out.println("Menu di " + this.base+" \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
        }
    }
}
