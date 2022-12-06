
public class Tester {
    public static void main(String[] args) {

//      Creazione dei menu
        Menu menu1 = new Menu(Menu.MenuType.Pesce);
        menu1.addDish(new FirstCourse("Primo Piatto", "Spaghetti allo scoglio", 12.55, "Spaghetti con vongole, cozze, calamari"));
        menu1.addDish(new SecondCourse("Secondo Piatto", "Orata al forno con patate", 17.00, "Orata, patate, rosmarino, aglio"));
        menu1.addDish(new Dessert("Dessert", "Torta al cioccolato", 6.50, "Cioccolato fondente, farina 00, uova"));
        menu1.addDish(new Drink("Drink", "Vino Lapilli", 6.00, "Bianco"));



//      Creazione ristoranti
        Restaurant restaurant1 = new Restaurant("Ristorante Gruppo 4", "Java 8",menu1);
        restaurant1.addTable(new Table(1, 4, Table.TablePosition.INDOOR));
        restaurant1.addTable(new Table(2,4, Table.TablePosition.INDOOR));
        restaurant1.getMenu().printMenu();
    }
}
