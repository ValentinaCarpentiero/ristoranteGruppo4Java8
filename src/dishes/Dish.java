package dishes;

public class Dish {
    private double dishPrice;
    private String dishName;
    private String course;
    private Enum dishType;

    public Dish(String course, String dishName, Enum dishType, double dishPrice){
        this.dishPrice = dishPrice;
        this.dishName = dishName;
        this.dishType = dishType;
        this.course = course;
    }

    public double getDishPrice() {
        return dishPrice;
    }
    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }
    public String getCourse() {
        return course;
    }
    public Enum getDishType() {
        return dishType;
    }

    public void setDishType(Enum dishType) {
        this.dishType = dishType;
    }


    public void printDishDetail() {
        System.out.println("### "+this.course +" ###"+"\n"+this.dishName+" - Prezzo: "+this.dishPrice);
    }
}