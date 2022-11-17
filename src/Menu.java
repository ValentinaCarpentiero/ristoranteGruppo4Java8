
public class Menu {
    private String restaurantName;
    private String menuType;
    private FirstCourse firstCourse;
    //private Second secondCourse;
    private Dessert dessert;

    public Menu(String menuType, String restaurantName, FirstCourse firstCourse) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.firstCourse = firstCourse;
    }


    public void print() {
        System.out.println("Restaurant name: "+this.restaurantName+" Menu type: "+this.menuType);
        System.out.println(firstCourse);
    }
}
