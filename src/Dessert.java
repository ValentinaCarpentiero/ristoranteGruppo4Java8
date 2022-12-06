public class Dessert extends Dish {
    public String dessertIngredients;

    public Dessert(double price, String goodName, String goodType, String dessertIngredients) {
        super(price, goodName, goodType);
        this.dessertIngredients = dessertIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.dessertIngredients+"\n");
    }

}
