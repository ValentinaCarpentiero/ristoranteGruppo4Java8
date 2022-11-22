import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        ArrayList<Dish> dishList = new ArrayList<>();

        Dish firstCourse1 =new FirstCourse(12.55, "Spaghetti allo scoglio","First Course", "Spaghetti con vongole, cozze, calamari");
        Dish secondCourse1 = new SecondCourse(17.00, "Orata al forno con patate", "Second Course","Orata, patate, rosmarino, aglio");
        Dish dessert1 = new Dessert(6.50, "Torta al cioccolato", "Dessert", "Cioccolato fondente, farina 00, uova");
        Dish drink1 = new Drink(6.00,"Lapilli","Vino","Bianco");
        Menu menu = new Menu("Pesce", "Restaurant Java 8 [Gruppo 4]");

        menu.addDish(firstCourse1);
        menu.addDish(secondCourse1);
        menu.addDish(dessert1);
        menu.addDish(drink1);
        menu.print();
    }
}
