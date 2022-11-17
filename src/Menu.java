
public class Menu {
    private String restaurantName;
    private String menuType;
    private FirstCourse firstCourse;
    private SecondCourse secondCourse;

    private Dessert dessert;

    public Menu(String menuType, String restaurantName, FirstCourse firstCourse,SecondCourse secondCourse ) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.firstCourse = firstCourse;
    }



    public void print() {
        System.out.println("Restaurant name: "+this.restaurantName+" Menu type: "+this.menuType);
        System.out.println(firstCourse);
        System.out.println (secondCourse);
    }
}
