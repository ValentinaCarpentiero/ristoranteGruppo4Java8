public class FirstCourse extends Dish {

    private String ingredients;


    public FirstCourse(double price, String goodName, String goodType, String ingredients) {
        super(price, goodName, goodType);
        this.ingredients = ingredients;
    }


    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredients: " +this.ingredients+"\n");
    }
}



