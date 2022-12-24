package main;

import booking.Customer;
import dishes.*;
import enums.BasedOn;
import enums.TypeOfMenu;
import restaurant.*;
import dishes.Dish.DietaryOptions;
import enums.Preferences;

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


        Menu menu1 = new Menu(Preferences.CARNIVOROUS, TypeOfMenu.DAILY, BasedOn.FISH);
        Menu menu2 = new Menu(Preferences.VEGETARIAN, TypeOfMenu.SPECIAL,BasedOn.VEGETABLES);
        Menu menu3 = new Menu(Preferences.VEGAN, TypeOfMenu.TASTING, BasedOn.VEGETABLES);

        menu1.addDish(new FirstCourse("First Course", "Spaghetti allo scoglio", Preferences.CARNIVOROUS, DietaryOptions.LOCALLY_PRODUCED, 12.55, "Spaghetti con vongole, cozze, calamari",true));
        menu1.addDish(new SecondCourse("Second Course", "Orata al forno con patate", Preferences.CARNIVOROUS,DietaryOptions.LOCALLY_PRODUCED, 17.00, "Orata","patate, rosmarino, aglio"));
        menu1.addDish(new Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, DietaryOptions.NUT_ALLERGIES, 6.50,"panna, zucchero",true));
        menu1.addDish(new Drink("Drink", "Vino Lapilli", Preferences.MIXED, 6.00, true, 12.0));

        menu2.addDish(new FirstCourse("First Course", "Orecchiette alle cime di rapa", Preferences.VEGETARIAN, DietaryOptions.LOCALLY_PRODUCED, 10.50, "Orecchiette, Aglio, Cime di Rapa,Peperone Crusco",true));
        menu2.addDish(new SecondCourse("Second Course", "Burger di Soia", Preferences.VEGETARIAN, DietaryOptions.LACTOSE_INTOLERANCE, 7.00, "Burger Vegetale alla Soia","Erba"));
        menu2.addDish(new Dessert("Dessert", "Cheesecake Frutti di Bosco", Preferences.MIXED, DietaryOptions.PEANUT_ALLERGY ,6.50,"Frutti di bosco",false));
        menu2.addDish(new Drink("Drink", "Coca Zero", Preferences.MIXED, 6.00, false));

        menu3.addDish(new FirstCourse("First Course", "Paccheri zucca e mandorle ", Preferences.VEGAN, DietaryOptions.LACTOSE_INTOLERANCE, 10.50, "Paccheri , zucca, mandorle",true));
        menu3.addDish(new SecondCourse("Second Course", "Sushi avocado", Preferences.VEGAN, DietaryOptions.GLUTEN_FREE,7.50, "Riso, avocado, Spalmabile alla Soia","Alghe"));
        menu3.addDish(new Dessert("Dessert", "Vegan Souffle", Preferences.VEGAN,DietaryOptions.LACTOSE_INTOLERANCE, 6.20,"Zucchero",false));
        menu3.addDish(new Drink("Drink", "Coca 0", Preferences.MIXED, 6.00, false));

        List<Menu> menus = new ArrayList<>();
        menus.add (menu1);
        menus.add (menu2);
        menus.add (menu3);
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8", menus, menu3.getDishList().get(1).getDishName(), Restaurant.TableService.A_LA_CARTE,32,"Credit Card, WiFi, Air-Conditioning, Wheelchair Accessible, Free Parking",true, false);
        restaurant1.printRestaurantDetails();


        Customer customer = new Customer("Lebron", "James","345545741","TacoThursday66@gmail.com",Preferences.VEGETARIAN, 12);
        Customer customer1= new Customer ( "Roger","Federer","334525458", "backmaster@gmail.nadal",Preferences.CARNIVOROUS,342);
        Customer customer2= new Customer ( "Ciro","Mertens","332253545","ciro@hotmail.com",Preferences.VEGAN,666);
        System.out.println();
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
