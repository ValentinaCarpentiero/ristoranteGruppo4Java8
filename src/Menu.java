import java.util.ArrayList;

public class Menu {
    private String restaurantName;
    private String menuType;

    private ArrayList<MenuItem> menuItemList;

    public Menu(String menuType, String restaurantName) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.menuItemList = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem){
        if (menuItem != null){
            menuItemList.add(menuItem);
        }
    }



    public void print(){
        System.out.println("@@@ Restaurant name: " + this.restaurantName + " - Menu type: " + this.menuType+" @@@ \n");
        for (int i = 0; i< menuItemList.size(); i++){
            System.out.println(menuItemList.get(i));
        }
    }
}
