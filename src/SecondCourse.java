public class SecondCourse extends Goods{

    public String secondIngredients;

    public SecondCourse(double price, String goodName, String goodType, String secondIngredients) {
        super ( price, goodName, goodType);
        this.secondIngredients=secondIngredients;
    }

    @Override
    public String toString() {
        System.out.println ("### Second Course ###");
        return "Type: " + super.getGoodType ()+" Dish: " + super.getGoodName ()+ "Ingredients: " +secondIngredients + " Price: " + super.getPrice () ;
    }
}
