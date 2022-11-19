public class Drink extends MenuItem {
    private String typeOfDrink;

    public Drink(double price, String goodName, String goodType, String typeOfDrink) {
        super(price, goodName, goodType);
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public String toString() {
        System.out.println("### Drink ###");
        return "Type: "+super.getItemType()+"\nDrink: "+super.getItemName()+" "+this.typeOfDrink+"\nPrice: "+super.getItemPrice();
    }
}
