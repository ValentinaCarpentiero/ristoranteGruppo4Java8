public class Tester {
    public static void main(String[] args) {


        FirstCourse firstCourse1 =new FirstCourse(12.55, "Spaghetti allo scoglio","First Course", "Spaghetti con vongole, cozze, calamari");
        SecondCourse secondCourse1 = new SecondCourse(17.00, "Orata al forno con patate", "Second Course","Orata, patate, rosmarino, aglio");
        Dessert dessert1 = new Dessert(6.50, "Torta al cioccolato", "Dessert", "Cioccolato fondente, farina 00, uova");
        Drink drink1 = new Drink(6.00,"Lapilli","Vino","Bianco");
        Menu menu = new Menu("Pesce", "Restaurant Java 8 [Gruppo 4]");

        menu.addMenuItem(firstCourse1);
        menu.addMenuItem(secondCourse1);
        menu.addMenuItem(dessert1);
        menu.addMenuItem(drink1);
        menu.print();
    }
}
