package dishes;

public class SecondCourse extends Dish {

    private String secondIngredients;

    public SecondCourse(String course, String dishName, Enum dishType, double price,  String ingredients) {
        super(course, dishName,dishType, price);
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
