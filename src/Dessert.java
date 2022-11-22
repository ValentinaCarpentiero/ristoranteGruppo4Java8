public class Dessert extends Dish {
    public String dessertIngredients;

    public Dessert(double price, String goodName, String goodType, String dessertIngredients) {
        super(price, goodName, goodType);
        this.dessertIngredients = dessertIngredients;
    }

    @Override
    public String toString() {
        System.out.println("### Dessert ###");
        return "Type: " + super.getItemType() + "\nDish: " + super.getItemName() + "\nIngredients: " + dessertIngredients + "\nPrice: " + super.getItemPrice()+"\n";
    }

}
