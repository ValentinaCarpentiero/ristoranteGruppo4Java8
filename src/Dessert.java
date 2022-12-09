public class Dessert extends Dish {
    private String dessertIngredients;

    public Dessert(String dishType, String dishName, double price,  String ingredients) {
        super(dishType, dishName, price);
        this.dessertIngredients = ingredients;
    }

    public String getDessertIngredients() {
        return dessertIngredients;
    }

    public void setDessertIngredients(String dessertIngredients) {
        this.dessertIngredients = dessertIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.dessertIngredients+"\n");
    }

}
