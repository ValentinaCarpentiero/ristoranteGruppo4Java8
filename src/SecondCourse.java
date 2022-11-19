public class SecondCourse extends MenuItem {

    public String secondIngredients;

    public SecondCourse(double price, String goodName, String goodType, String secondIngredients) {
        super ( price, goodName, goodType);
        this.secondIngredients=secondIngredients;
    }

    @Override
    public String toString() {
        System.out.println ("### Second Course ###");
        return "Type: " + super.getItemType()+"\nDish: " + super.getItemName()+ "\nIngredients: " +secondIngredients + "\nPrice: " + super.getItemPrice()+"\n";
    }
}
