public class Drink extends Dish {
    private String typeOfDrink;

    public Drink(double price, String goodName, String goodType, String typeOfDrink) {
        super(price, goodName, goodType);
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
    }
}
