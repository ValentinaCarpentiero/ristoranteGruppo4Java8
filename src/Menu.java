
public class Menu {
    private String restaurantName;
    private String menuType;
    //private First mainCourse;
    private SecondCourse secondCourse;
    private Dessert dessert;

    public Menu(String menuType, String restaurantName) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
    }

    public void print(){
        System.out.println ("Restaurant name:" + this.restaurantName + "Menu type: " + this.menuType);
        System.out.println (secondCourse);


    }

}
