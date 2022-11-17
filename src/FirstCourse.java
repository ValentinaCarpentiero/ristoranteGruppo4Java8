public class FirstCourse extends Goods  {

    private String ingredients;


    public FirstCourse(double price, String goodName, String goodType, String ingredients) {
        super(price, goodName, goodType);
        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        System.out.println("### First Course ###");
        return "Type: "+super.getGoodType()+"\nDish: "+super.getGoodName()+"\nIngredients: "+this.ingredients+"\nPrice: "+super.getPrice();
    }

}



