public class Tester {
    public static void main(String[] args) {


        FirstCourse firstCourse1 =new FirstCourse(12.55, "Spaghetti allo scoglio","First Course", "Spaghetti con vongole, cozze, calamari");
        SecondCourse secondCourse1 = new SecondCourse(17.00, "Orata al forno con patate", "Second Course","Orata, patate, rosmarino, aglio");
        Dessert dessert1 = new Dessert(6.50, "Torta al cioccolato", "Dessert", "Cioccolato fondente, farina 00, uova");

        Menu menu = new Menu("Pesce", "Restaurant Java 8 [Gruppo 4]", firstCourse1,secondCourse1, dessert1);

        menu.print();
    }
}
