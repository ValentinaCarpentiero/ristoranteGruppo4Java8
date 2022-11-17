public class Tester {
    public static void main(String[] args) {



        FirstCourse firstCourse1 = new FirstCourse(12.55, "Spaghetti allo scoglio","First Course","Vongole, Scampi, Cozze, Calamari");
        Menu menu = new Menu("Pesce","Restaurant Java 8 Gruppo 4", firstCourse1);

        menu.print();



    }
}
