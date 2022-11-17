public abstract class Goods {
    private double price;
    private String goodName;
    private String goodType;

    public Goods(double price, String goodName,String goodType){
        this.price = price;
        this.goodName = goodName;
        this.goodType = goodType;
    }
}
