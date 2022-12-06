public class Restaurant {
    enum RestaurantType{
        Pizzeria, Ristorante, Trattoria, Bistrot, Sushi, Hamburgheria
    }

    private String restaurantName;
    private String address;
    private RestaurantType restaurantType;
    private Menu menu;
    boolean isOpen;

    public Restaurant(String restaurantName, RestaurantType restaurantType,String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
    }


}
