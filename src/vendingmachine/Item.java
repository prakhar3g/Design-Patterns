package vendingmachine;

public class Item {
    private int itemCode;
    private int price;
    private int numberOfUnits;
    private boolean isSoldOut;

    public Item(int itemCode, int price, int numberOfUnits) {
        this.itemCode = itemCode;
        this.price = price;
        this.numberOfUnits = numberOfUnits;
        this.isSoldOut = false;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

    public void reduceItemUnits(){
    }
}
