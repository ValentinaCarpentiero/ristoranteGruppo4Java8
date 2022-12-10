package dishes;

public class Dessert extends Dish {
    private String dessertIngredients;

    public Dessert(String course, String dishName,Enum dishType, double price,  String ingredients) {
        super(course, dishName,dishType, price);
        this.dessertIngredients = ingredients;
    }

    public String getDessertIngredients() {
        return dessertIngredients;
    }

    public void setDessertIngredients(String dessertIngredients) {
        this.dessertIngredients = dessertIngredients;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.dessertIngredients+"\n");
    }

}
