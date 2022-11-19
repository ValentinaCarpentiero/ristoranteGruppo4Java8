public abstract class MenuItem {
    private double itemPrice;
    private String itemName;
    private String itemType;


    public MenuItem(double itemPrice, String itemName, String itemType){
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
}
