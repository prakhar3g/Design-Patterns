package InventoryorManegementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Inventory {
    private String inventoryId;
    private List<Product> products;

    Inventory() {
        inventoryId = String.valueOf(UUID.randomUUID());
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(Map<String, Integer> productVsCount) {
        for (Map.Entry<String,Integer> entry : productVsCount.entrySet()) {
            Product product = getProductFromId(entry.getKey());
            product.increaseProductUnits(entry.getValue().intValue());
        }
    }

    public void removeProduct(Map<String, Integer> productVsCount) {
        for (Map.Entry<String,Integer> entry : productVsCount.entrySet()) {
            Product product = getProductFromId(entry.getKey());
            product.reduceProductUnits(entry.getValue().intValue());
        }
    }

    public Product getProductFromId(String productId) {
        for (Product product:products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}
