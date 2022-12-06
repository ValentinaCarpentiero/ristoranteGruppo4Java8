import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantName;
    private String address;
    private Menu menu;
    private List<Table> tableList;
    boolean isOpen;

    public Restaurant(String restaurantName, String address, Menu menu) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu ;
        this.tableList = new ArrayList<>();
        this.isOpen = true;
    }


    public void addTable(Table table){
        tableList.add(table);
    }
    public void removeTable(Table table){
        tableList.remove(table);
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Menu getMenu() {
        return menu;
    }
}


