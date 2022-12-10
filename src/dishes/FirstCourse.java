package dishes;

public class FirstCourse extends Dish {

    private String firstIngredients;

    public FirstCourse(String course, String dishName,Enum dishType, double price,  String firstIngredients) {
        super(course, dishName,dishType, price);
        this.firstIngredients = firstIngredients;
    }

    public String getFirstIngredients() {
        return firstIngredients;
    }

    public void setFirstIngredients(String firstIngredients) {
        this.firstIngredients = firstIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.firstIngredients +"\n");
    }
}



