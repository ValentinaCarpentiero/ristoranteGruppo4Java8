public class Dish {
    private double dishPrice;
    private String dishName;
    private String dishType;


    public Dish(String dishType, String dishName, double dishPrice){
        this.dishPrice = dishPrice;
        this.dishName = dishName;
        this.dishType = dishType;
    }



    public void printDishDetail() {
        System.out.println("### "+this.dishType+" ###"+"\n"+this.dishName+" - Prezzo: "+this.dishPrice);
    }
}
