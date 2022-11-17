public class Tester {
    public static void main(String[] args) {
        Dessert dessert1 = new Dessert(6.50, "Torta al cioccolato", "Dessert", "Cioccolato fondente, farina 00, uova");

        Menu menu = new Menu("Pesce", "Restaurant Java 8 Gruppo 4", dessert1);

        menu.print();
    }
}
