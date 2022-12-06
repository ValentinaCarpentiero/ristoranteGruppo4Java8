public class SecondCourse extends Dish {

    public String secondIngredients;

    public SecondCourse(double price, String goodName, String goodType, String secondIngredients) {
        super ( price, goodName, goodType);
        this.secondIngredients=secondIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.secondIngredients+"\n");
    }
}
