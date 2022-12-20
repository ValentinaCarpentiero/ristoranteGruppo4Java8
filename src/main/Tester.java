package main;

import booking.Customer;
import dishes.Dessert;
import dishes.Drink;
import dishes.FirstCourse;
import dishes.SecondCourse;
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


        Menu menu1 = new Menu(Preferences.CARNIVOROUS, Menu.Type.DAILY, Menu.BasedOn.FISH,false);
        Menu menu2 = new Menu(Preferences.VEGETARIAN, Menu.Type.DAILY, Menu.BasedOn.VEGETABLES,false);
        Menu menu3 = new Menu(Preferences.VEGAN, Menu.Type.DAILY, Menu.BasedOn.VEGETABLES,false);


        menu1.addDish(new FirstCourse("Primo Piatto", "Spaghetti allo scoglio", Preferences.CARNIVOROUS, 12.55, "Spaghetti con vongole, cozze, calamari",true));
        menu1.addDish(new SecondCourse("Secondo Piatto", "Orata al forno con patate", Preferences.CARNIVOROUS, 17.00, "Orata, patate, rosmarino, aglio",true));
        menu1.addDish(new Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, 6.50,"zucchero",false));
        menu1.addDish(new Drink("Drink", "Vino Lapilli", Preferences.MIXED, 6.00, "Bianco"));

        menu2.addDish(new FirstCourse("Primo Piatto", "Orecchiette Cime di Rapa", Preferences.VEGETARIAN, 10.50, "Orecchiette, Aglio, Cime di Rapa,Peperone Crusco",true));
        menu2.addDish(new SecondCourse("Secondo Piatto", "Burger di Soia", Preferences.VEGETARIAN, 7.00, "Burger Vegetale alla Soia",true));
        menu2.addDish(new Dessert("Dessert", "Cheesecake Frutti di Bosco", Preferences.MIXED, 6.50,"zucchero",false));
        menu2.addDish(new Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, "0 Zuccheri aggiunti"));

        menu3.addDish(new FirstCourse("Primo Piatto", "Paccheri zucca e mandorle ", Preferences.VEGAN, 10.50, "Paccheri , zucca, mandorle",true));
        menu3.addDish(new SecondCourse("Secondo Piatto", "Sushi avocado", Preferences.VEGAN, 7.50, "Riso, avocado, Spalmabile alla Soia",false));
        menu3.addDish(new Dessert("Dessert", "Vegan Souffle", Preferences.VEGAN, 6.20,"Zucchero",false));
        menu3.addDish(new Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, "0 Zuccheri aggiunti"));

        List<Menu> menus = new ArrayList<>();
        menus.add (menu1);
        menus.add (menu2);
        menus.add (menu3);
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8", menus, menu3.getDishList().get(1).getDishName(), Restaurant.TableService.A_LA_CARTE,32,"Credit Card, WiFi, Air-Conditioning, Wheelchair Accessible, Free Parking",true, false);
        restaurant1.printRestaurantDetails();


        Customer customer = new Customer("Lebron", "James","345545741","TacoThursday66@gmail.com",Preferences.VEGETARIAN, 12);
        Customer customer1= new Customer ( "Roger","Federer","334525458", "backmaster@gmail.nadal",Preferences.CARNIVOROUS,342);
        Customer customer2= new Customer ( "Ciro","Mertens","332253545","ciro@hotmail.com",Preferences.VEGAN,666);

        System.out.println("✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩ ✩｡:*•.─────  ❁ ❁  ─────.•*:｡✩");

        restaurant1.printMenu(customer);

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
