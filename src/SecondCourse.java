public class SecondCourse extends Dish {

    public String secondIngredients;

    public SecondCourse(String dishType, String dishName, double price,  String ingredients) {
        super(dishType, dishName, price);
        this.secondIngredients = ingredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.secondIngredients+"\n");
    }
}
