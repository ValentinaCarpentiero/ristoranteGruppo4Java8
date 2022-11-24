import java.util.ArrayList;

public class Menu {
    private String restaurantName;
    private String menuType;
    private ArrayList<Dish> dishList;

    public Menu(String menuType, String restaurantName) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.dishList = new ArrayList<>();
    }

    public void addDish(Dish dish){
            dishList.add(dish);
        }

    public void print(){
        System.out.println("@@@ Restaurant name: " + this.restaurantName + " - Menu type: " + this.menuType+" @@@ \n");
        for (Dish dish : dishList) {
            dish.printDishDetail();
        }
    }
}
