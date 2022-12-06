public class Dessert extends Dish {
    public String dessertIngredients;

    public Dessert(String dishType, String dishName, double price,  String ingredients) {
        super(dishType, dishName, price);
        this.dessertIngredients = ingredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.dessertIngredients+"\n");
    }

}
