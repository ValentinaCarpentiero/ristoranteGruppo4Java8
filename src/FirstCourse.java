public class FirstCourse extends Dish {

    private String ingredients;


    public FirstCourse(double price, String goodName, String goodType, String ingredients) {
        super(price, goodName, goodType);
        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        System.out.println("### First Course ###");
        return "Type: "+super.getItemType()+"\nDish: "+super.getItemName()+"\nIngredients: "+this.ingredients+"\nPrice: "+super.getItemPrice()+"\n";
    }

}



