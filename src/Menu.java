
public class Menu {
    private String restaurantName;
    private String menuType;
    private FirstCourse firstCourse;
    private SecondCourse secondCourse;
    private Dessert dessert;

    public Menu(String menuType, String restaurantName, FirstCourse firstCourse, SecondCourse secondCourse, Dessert dessert) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.firstCourse = firstCourse;
        this.secondCourse = secondCourse;
        this.dessert = dessert;
    }

    public void print(){
        System.out.println("@@@ Restaurant name: " + this.restaurantName + " - Menu type: " + this.menuType+" @@@ \n");
        System.out.println(firstCourse);
        System.out.println(secondCourse);
        System.out.println(dessert);
    }
}
