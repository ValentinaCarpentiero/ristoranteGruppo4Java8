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
        if (dish != null){
            dishList.add(dish);
        }
    }

    public void setDishList(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    public void print(){
        //TODO fare il for each
        System.out.println("@@@ Restaurant name: " + this.restaurantName + " - Menu type: " + this.menuType+" @@@ \n");
        for (int i = 0; i< dishList.size(); i++){
            //TODO sistemare
          dishList.get(i).printDishDetail();
        }
    }
}
