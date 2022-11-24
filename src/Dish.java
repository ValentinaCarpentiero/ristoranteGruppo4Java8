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
        System.out.println("### "+this.itemType+" ###"+"\n"+this.itemName+" - Price: "+this.itemPrice);
    }
}
