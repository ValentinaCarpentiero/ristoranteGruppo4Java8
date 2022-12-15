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


        Menu menu1 = new Menu("Menu del giorno/Menu of the day",false, Preferences.CARNIVOROUS);
        Menu menu2 = new Menu("Menu del giorno/Menu of the day",false, Preferences.VEGETARIAN);
        Menu menu3 = new Menu ("Menu del giorno/Menu of the day",false, Preferences.VEGAN);


        menu1.addDish(new dishes.FirstCourse("Primo Piatto", "Spaghetti allo scoglio", Preferences.CARNIVOROUS, 12.55, "Spaghetti con vongole, cozze, calamari",true));
        menu1.addDish(new dishes.SecondCourse("Secondo Piatto", "Orata al forno con patate", Preferences.CARNIVOROUS, 17.00, "Orata, patate, rosmarino, aglio",true));
        menu1.addDish(new dishes.Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, 6.50,"zucchero",false));
        menu1.addDish(new dishes.Drink("Drink", "Vino Lapilli", Preferences.MIXED, 6.00, "Bianco"));

        menu2.addDish(new dishes.FirstCourse("Primo Piatto", "Orecchiette Cime di Rapa", Preferences.VEGETARIAN, 10.50, "Orecchiette, Aglio, Cime di Rapa,Peperone Crusco",true));
        menu2.addDish(new dishes.SecondCourse("Secondo Piatto", "Burger di Soia", Preferences.VEGETARIAN, 7.00, "Burger Vegetale alla Soia",true));
        menu2.addDish(new dishes.Dessert("Dessert", "Cheesecake Frutti di Bosco", Preferences.MIXED, 6.50,"zucchero",false));
        menu2.addDish(new dishes.Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, "0 Zuccheri aggiunti"));

        menu3.addDish(new dishes.FirstCourse("Primo Piatto", "Paccheri zucca e mandorle ", Preferences.VEGAN, 10.50, "Paccheri , zucca, mandorle",true));
        menu3.addDish(new dishes.SecondCourse("Secondo Piatto", "Sushi avocado", Preferences.VEGAN, 7.50, "Riso, avocado, Spalmabile alla Soia",false));
        menu3.addDish(new dishes.Dessert("Dessert", "Vegan Souffle", Preferences.VEGAN, 6.20,"Zucchero",false));
        menu3.addDish(new dishes.Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, "0 Zuccheri aggiunti"));

        List<Menu> menuOfTheDay = new ArrayList<>();
        menuOfTheDay.add (menu1);
        menuOfTheDay.add (menu2);
        menuOfTheDay.add (menu3);
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8", menuOfTheDay );

        Customer customer = new Customer("Lebron James","TacoThursday66@gmail.com","345545741",Preferences.VEGETARIAN);
        Customer customer1= new Customer ( "Roger Federer","backmaster@gmail.nadal","334525458",Preferences.CARNIVOROUS);
        Customer customer2= new Customer ( "Ciro Mertens","ciro@hotmail.com","332253545",Preferences.VEGAN);

        System.out.println (
                "░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░\n" +
                "░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░\n" +
                "░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░\n" +
                "░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░\n" +
                "░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░\n" +
                "░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░\n" +
                "░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░\n" +
                "░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░\n" +
                "░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░\n" +
                "░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░\n" +
                "░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░\n" +
                "░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░\n" +
                "░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░\n" +
                "░░░░█░░░░░░░░░░░░░░░░░░░░░█░░\n" +
                "░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░\n" +
                "░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░\n");

        System.out.println("✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");

        restaurant1.printMenu(customer2);

        System.out.println("✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");

        System.out.println ("Buona ... ");

        System.out.println("░░░░░░░░░░░█▀▀░░█░░░░░░\n" +
                "░░░░░░▄▀▀▀▀░░░░░█▄▄░░░░\n" +
                "░░░░░░█░█░░░░░░░░░░▐░░░\n" +
                "░░░░░░▐▐░░░░░░░░░▄░▐░░░\n" +
                "░░░░░░█░░░░░░░░▄▀▀░▐░░░\n" +
                "░░░░▄▀░░░░░░░░▐░▄▄▀░░░░\n" +
                "░░▄▀░░░▐░░░░░█▄▀░▐░░░░░\n" +
                "░░█░░░▐░░░░░░░░▄░█░░░░░\n" +
                "░░░█▄░░▀▄░░░░▄▀▐░█░░░░░\n" +
                "░░░█▐▀▀▀░▀▀▀▀░░▐░█░░░░░\n" +
                "░░▐█▐▄░░▀░░░░░░▐░█▄▄░░░\n" +
                "░░░▀▀▄░░░░░░░░▄▐▄▄▄▀░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░");













    }
}
