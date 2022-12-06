public class FirstCourse extends Dish {

    private String ingredients;


    public FirstCourse(String dishType, String dishName, double price,  String ingredients) {
        super(dishType, dishName, price);
        this.ingredients = ingredients;
    }


    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Ingredienti: " +this.ingredients+"\n");
    }
}



