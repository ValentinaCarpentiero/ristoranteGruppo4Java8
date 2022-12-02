import java.util.ArrayList;

public class Menu {
    public enum MenuType{
    Carne,
    Pesce
}
    private MenuType menuType;
    private ArrayList<Dish> dishList;

    public Menu(MenuType menuType) {
        this.menuType = menuType;
        this.dishList = new ArrayList<>();
    }

    public void addDish(Dish dish){
            dishList.add(dish);
        }
    public void removeDish(Dish dish){ dishList.remove(dish);}

    public void print(){
        System.out.println("Menu di " + this.menuType+" \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
        }
    }
}
