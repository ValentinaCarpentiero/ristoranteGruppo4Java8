import java.util.ArrayList;

public class Menu {
    private String restaurantName;
    private String menuType;

    private ArrayList<Goods> goodsList;

    public Menu(String menuType, String restaurantName) {
        this.menuType = menuType;
        this.restaurantName = restaurantName;
        this.goodsList = new ArrayList<>();
    }

    public void addGoods(Goods goods){
        if (goods != null){
            goodsList.add(goods);
        }
    }



    public void print(){
        System.out.println("@@@ Restaurant name: " + this.restaurantName + " - Menu type: " + this.menuType+" @@@ \n");
        for (int i=0; i<goodsList.size();i++){
            System.out.println(goodsList.get(i));
        }
    }
}
