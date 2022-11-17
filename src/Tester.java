public class Tester {
    public static void main(String[] args) {

        FirstCourse firstCourse1 = new FirstCourse(12.55, "Spaghetti allo scoglio","First Course","Vongole, Scampi, Cozze, Calamari");

        SecondCourse secondCourse = new SecondCourse ( 15.5,"Orata al forno", "Second Course","Pescato di giornata , Olio Evtravergine, Sale, Pepe, Limone"  );

        Menu menu = new Menu("Pesce","Restaurant Java 8 Gruppo 4", firstCourse1, secondCourse);

        menu.print();




    }
}
