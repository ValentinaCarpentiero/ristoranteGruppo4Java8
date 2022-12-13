package main;

import booking.Customer;
import restaurant.*;
import restaurant.Preferences;

/**
 * This is the Tester class with a main method
 * @author Valentina Carpentiero , Alvise Zingales , Daniele Caramanica
 */
public class Tester {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {


        Menu menu1 = new Menu(Preferences.CARNIVOROUS);
        menu1.addDish(new dishes.FirstCourse("Primo Piatto", "Spaghetti allo scoglio", Preferences.CARNIVOROUS, 12.55, "Spaghetti con vongole, cozze, calamari"));
        menu1.addDish(new dishes.SecondCourse("Secondo Piatto", "Orata al forno con patate", Preferences.CARNIVOROUS, 17.00, "Orata, patate, rosmarino, aglio"));
        menu1.addDish(new dishes.Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, 6.50, "Cioccolato fondente, farina 00, uova"));
        menu1.addDish(new dishes.Drink("Drink", "Vino Lapilli", Preferences.MIXED, 6.00, "Bianco"));
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8",menu1);
        restaurant1.printMenu();


        Customer customer = new Customer("baudo","pippobaudocapellone@gmail.com", "",Preferences.CARNIVOROUS);








    }
}
