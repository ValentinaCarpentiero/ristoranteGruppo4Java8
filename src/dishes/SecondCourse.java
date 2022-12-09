package dishes;

public class SecondCourse extends Dish {

    private String secondIngredients;

    public SecondCourse(String dishType, String dishName, double price,  String ingredients) {
        super(dishType, dishName, price);
        this.secondIngredients = ingredients;
    }

    public String getSecondIngredients() {
        return secondIngredients;
    }

    public void setSecondIngredients(String secondIngredients) {
        this.secondIngredients = secondIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.secondIngredients+"\n");
    }
}
