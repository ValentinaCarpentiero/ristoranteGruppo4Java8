public class Dish {
    private double itemPrice;
    private String itemName;
    private String itemType;


    public Dish(double itemPrice, String itemName, String itemType){
        this.itemPrice = itemPrice;
        this.itemName = itemName;
        this.itemType = itemType;
    }


    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void printDishDetail() {
        //stampo i dettagli della portata
        System.out.println("### First Course ###");
    }
}
