package main;

import booking.Customer;
import dishes.*;
import enums.*;
import restaurant.Menu;
import restaurant.Restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is the Tester class with a main method
 * @author Valentina Carpentiero, Alvise Zingales, Daniele Caramanica
 */
public class Tester {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {

        /**
         *  DISH LISTS CREATION
         */

        List<Dish> dishList1 = new ArrayList<>();
        dishList1.add(new FirstCourse("First Course", "Spaghetti allo scoglio", Preferences.CARNIVOROUS,DietaryOptions.LOCALLY_PRODUCED, 12.55, "Spaghetti con vongole, cozze, calamari",true));
        dishList1.add(new SecondCourse("Second Course", "Orata al forno con patate", Preferences.CARNIVOROUS,DietaryOptions.LOCALLY_PRODUCED, 17.00, "Orata","patate, rosmarino, aglio"));
        dishList1.add(new Dessert("Dessert", "Torta al cioccolato", Preferences.MIXED, DietaryOptions.LOCALLY_PRODUCED, 6.50,"panna, zucchero",true));
        dishList1.add(new Drink("Drink", "Vino Lapilli", Preferences.MIXED, DietaryOptions.LOCALLY_PRODUCED, "Base di chardonnay vinificato insieme ad altri vitigni della zona che conferiscono sapidità.", 16.00, 12.5,true));

        List<Dish> dishList2 = new ArrayList<>();
        dishList2.add(new FirstCourse("First Course", "Orecchiette alle cime di rapa", Preferences.VEGETARIAN, DietaryOptions.LOCALLY_PRODUCED, 10.50, "Orecchiette, Aglio, Cime di Rapa,Peperone Crusco",true));
        dishList2.add(new SecondCourse("Second Course", "Burger di Soia", Preferences.VEGETARIAN, DietaryOptions.LACTOSE_FREE, 7.00, "Burger Vegetale alla Soia","Erba"));
        dishList2.add(new Dessert("Dessert", "Cheesecake Frutti di Bosco", Preferences.MIXED, DietaryOptions.PEANUT_FREE,6.50,"Frutti di bosco",false));
        dishList2.add(new Drink("Drink", "Coca Zero", Preferences.MIXED,DietaryOptions.LOCALLY_PRODUCED, "Coca cola senza zuccheri", 6.00, 0,false));

        List<Dish> dishList3 = new ArrayList<>();
        dishList3.add(new FirstCourse("First Course", "Paccheri zucca e mandorle ", Preferences.VEGAN, DietaryOptions.LACTOSE_FREE, 10.50, "Paccheri , zucca, mandorle",true));
        dishList3.add(new SecondCourse("Second Course", "Sushi avocado", Preferences.VEGAN, DietaryOptions.GLUTEN_FREE,7.50, "Riso, avocado, Spalmabile alla Soia","Alghe"));
        dishList3.add(new Dessert("Dessert", "Vegan Souffle", Preferences.VEGAN,DietaryOptions.LACTOSE_FREE, 6.20,"Zucchero",false));
        dishList3.add(new Drink("Drink", "Coca 0", Preferences.MIXED, DietaryOptions.LOCALLY_PRODUCED, "Coca cola senza zuccheri", 6.00, 0,false));

        /**
         *  MENUS CREATION
         */

        Menu menu1 = new Menu(Preferences.CARNIVOROUS, TypeOfMenu.DAILY, BasedOn.FISH,dishList1);
        Menu menu2 = new Menu(Preferences.VEGETARIAN, TypeOfMenu.SPECIAL,BasedOn.VEGETABLES,dishList2);
        Menu menu3 = new Menu(Preferences.VEGAN, TypeOfMenu.TASTING, BasedOn.VEGETABLES,dishList3);

        List<Menu> menus = new ArrayList<>();
        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);

        /**
         *  RESTAURANTS CREATION
         */

        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8", menus, menu3.getDishList().get(1).getDishName(), 100,TableService.A_LA_CARTE,32,"Credit Card, WiFi, Air-Conditioning, Wheelchair Accessible, Free Parking",true, false);
        restaurant1.printRestaurantDetails();

        /**
         *  CUSTOMERS CREATION
         */

        Customer customer= new Customer("Lebron", "James","345545741","TacoThursday66@gmail.com",Preferences.VEGETARIAN,5);
        Customer customer1= new Customer("Roger","Federer","334525458", "backmaster@gmail.nadal",Preferences.CARNIVOROUS,7);
        Customer customer2= new Customer("Ciro","Mertens","332253545","ciro@hotmail.com",Preferences.VEGAN,8);


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


        /**
         *  BOOKINGS CREATION
         */

        restaurant1.prenotation(customer1);
        restaurant1.payCount(customer1);




       /* LocalDateTime today = LocalDateTime.now();
        LocalDateTime tomorrow = today.plusDays(1);

        BookingManager bookingManager = BookingManager.getInstance();
        bookingManager.createBooking(customer1, restaurant1, today , 7, "Nessuna richiesta");
        System.out.println(bookingManager.getAvailableSeats(today,restaurant1));;
        bookingManager.createBooking(customer2, restaurant1, tomorrow, 10, "Nessuna richiesta");
        System.out.println(bookingManager.getAvailableSeats(tomorrow,restaurant1));;
        bookingManager.createBooking(customer, restaurant1,today, 10, "Tavolo interno");
        System.out.println(bookingManager.getAvailableSeats(today,restaurant1));;
        bookingManager.deleteBooking(customer1, today);
        System.out.println(bookingManager.getAvailableSeats(today,restaurant1));;
        bookingManager.modifyBooking(customer,today,tomorrow,10);
        System.out.println(bookingManager.getAvailableSeats(today,restaurant1));;
        bookingManager.printBookingList();

        */



    }
}
