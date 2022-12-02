
public class Tester {
    public static void main(String[] args) {

        Dish firstCourse1 =new FirstCourse(12.55, "Spaghetti allo scoglio","Primo piatto", "Spaghetti con vongole, cozze, calamari");
        Dish secondCourse1 = new SecondCourse(17.00, "Orata al forno con patate", "Secondo piatto","Orata, patate, rosmarino, aglio");
        Dish dessert1 = new Dessert(6.50, "Torta al cioccolato", "Dessert", "Cioccolato fondente, farina 00, uova");
        Dish drink1 = new Drink(6.00,"Lapilli","Vino","Bianco");
        Menu menu = new Menu( Menu.MenuType.Pesce);


        menu.addDish(firstCourse1);
        menu.addDish(secondCourse1);
        menu.addDish(dessert1);
        menu.addDish(drink1);
        menu.print();

        Table table1 = new Table(1,"4 posti");
        Table table2 = new Table(2,"2 posti");

    }
}
