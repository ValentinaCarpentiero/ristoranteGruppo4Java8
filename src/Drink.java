public class Drink extends Goods{
    private String typeOfDrink;

    public Drink(double price, String goodName, String goodType, String typeOfDrink) {
        super(price, goodName, goodType);
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public String toString() {
        System.out.println("### Drink ###");
        return "Type: "+super.getGoodType()+"\nDrink: "+super.getGoodName()+" "+this.typeOfDrink+"\nPrice: "+super.getPrice();
    }
}
