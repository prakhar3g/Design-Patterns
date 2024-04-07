package vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> itemList;

    public Inventory() {
        itemList = new ArrayList<>();
    }

    public void addItem(int itemCode,int price,int numberOfUnits) {
        Item item = new Item(itemCode,price,numberOfUnits);
        itemList.add(item);
    }

    public Item getItem(int itemCode) throws Exception {
        for (Item item: itemList) {
            if (item.getItemCode() == itemCode) {
                return item;
            }
        }
        throw new Exception("Invalid Code");
    }

    public void reduceItemUnits(Item item){
        item.setNumberOfUnits(item.getNumberOfUnits()-1);
        if (item.getNumberOfUnits() == 0){
            item.setSoldOut(true);
        }
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
