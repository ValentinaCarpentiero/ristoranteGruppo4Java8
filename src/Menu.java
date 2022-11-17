
public class Menu {
    private String restaurantName;
    private String menuType;
    private Dessert dessert;

    public Menu(String menuType, String restaurantName, Dessert dessert) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.dessert = dessert;
    }

    public void print(){
        System.out.println("Restaurant name: " + this.restaurantName + " Menu type: " + this.menuType);
        System.out.println(dessert);
    }
}
