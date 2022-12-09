package dishes;

public class Drink extends Dish {
    private String typeOfDrink;

    public Drink(String dishType,String dishName, double price,  String typeOfDrink) {
        super(dishType, dishName, price);
        this.typeOfDrink = typeOfDrink;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public void printDishDetail() {
        super.printDishDetail();
        System.out.println("Tipo : "+this.typeOfDrink+"\n");
    }
}
