public class Dessert extends Goods {
    public String dessertIngredients;

    public Dessert(double price, String goodName, String goodType, String dessertIngredients) {
        super(price, goodName, goodType);
        this.dessertIngredients = dessertIngredients;
    }

    @Override
    public String toString() {
        System.out.println("### Dessert ###");
        return "Type: " + super.getGoodType() + "\nDish: " + super.getGoodName() + "\nIngredients: " + dessertIngredients + "\nPrice: " + super.getPrice()+"\n";
    }

}
