package InventoryorManegementSystem;

import java.util.UUID;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int numberOfUnits;

    public Product(String productName,double price, int numberOfUnits) {
        this.productId = UUID.randomUUID().toString();
        this.productName = productName;
        this.price = price;
        this.numberOfUnits = numberOfUnits;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void reduceProductUnits(int units) {
        numberOfUnits = numberOfUnits-units;
    }

    public void increaseProductUnits(int units) {
        numberOfUnits = numberOfUnits+units;
    }
}
