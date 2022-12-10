package dishes;

public class Drink extends Dish {
    private String typeOfDrink;

    public Drink(String course,String dishName,Enum dishType, double price,  String typeOfDrink) {
        super(course, dishName, dishType,price);
        this.typeOfDrink = typeOfDrink;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }


    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Tipo : "+this.typeOfDrink+"\n");
    }
}
