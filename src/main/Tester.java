package main;

import restaurant.Enum;
import restaurant.Menu;


public class Tester {
    public static void main(String[] args) {

//      Creazione dei menu

        restaurant.Menu menu1 = new restaurant.Menu(Enum.CARNIVOROUS,Menu.BasedOn.FISH);
        menu1.addDish(new dishes.FirstCourse("Primo Piatto", "Spaghetti allo scoglio", Enum.CARNIVOROUS, 12.55, "Spaghetti con vongole, cozze, calamari"));
        menu1.addDish(new dishes.SecondCourse("Secondo Piatto", "Orata al forno con patate",Enum.CARNIVOROUS, 17.00, "Orata, patate, rosmarino, aglio"));
        menu1.addDish(new dishes.Dessert("Dessert", "Torta al cioccolato", Enum.MIXED, 6.50, "Cioccolato fondente, farina 00, uova"));
        menu1.addDish(new dishes.Drink("Drink", "Vino Lapilli",Enum.MIXED, 6.00, "Bianco"));

     

//      Creazione ristoranti

        restaurant.Restaurant restaurant1 = new restaurant.Restaurant("Ristorante Gruppo 4", "Java 8",menu1);


    }
}
