package InventoryorManegementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Cart {
    private String cartId;
    private Map<String,Integer> productIdVsCount;

    public Cart() {
        cartId = UUID.randomUUID().toString();
        productIdVsCount = new HashMap<>();
    }

    public void addItemInCart(String productId,int count) {
        productIdVsCount.put(productId,count);
    }

    public void removeItemFromCart(int productId,int count) {

    }

    public void clearCart() {
        productIdVsCount = new HashMap<>();
    }

    public Map<String,Integer> getCartItems() {
        return productIdVsCount;
    }
}
