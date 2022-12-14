package main;

import booking.Customer;
import restaurant.*;
import restaurant.Preferences;

import java.util.ArrayList;
import java.util.List;

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
        Menu menu2 = new Menu(Preferences.VEGETARIAN);

        menu1.addDish(new dishes.FirstCourse("Primo Piatto", "Spaghetti allo scoglio", Preferences.CARNIVOROUS, 12.55, "Spaghetti con vongole, cozze, calamari"));
        menu1.addDish(new dishes.SecondCourse("Secondo Piatto", "Orata al forno con patate", Preferences.CARNIVOROUS, 17.00, "Orata, patate, rosmarino, aglio"));
        menu1.addDish(new dishes.Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, 6.50));
        menu1.addDish(new dishes.Drink("Drink", "Vino Lapilli", Preferences.MIXED, 6.00, "Bianco"));

        menu2.addDish(new dishes.FirstCourse("Primo Piatto", "Orecchiette Cime di Rapa", Preferences.VEGETARIAN, 10.50, "Orecchiette, Aglio, Cime di Rapa,Peperone Crusco"));
        menu2.addDish(new dishes.SecondCourse("Secondo Piatto", "Burger di Soia", Preferences.VEGETARIAN, 7, "Burger Vegetale alla Soia"));
        menu2.addDish(new dishes.Dessert("Dessert", "Cheesecake Frutti di Bosco", Preferences.MIXED, 6.50));
        menu2.addDish(new dishes.Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, "0 Zuccheri aggiunti"));

        List<Menu> menu = new ArrayList<>();
        menu.add (menu1);
        menu.add (menu2);
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8",menu);

        Customer customer = new Customer("baudo","pippobaudocapellone@gmail.com", "6656565",Preferences.CARNIVOROUS);

        restaurant1.printMenu(customer);







    }
}
