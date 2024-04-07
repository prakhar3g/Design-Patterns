package InventoryorManegementSystem;

import java.util.Map;
import java.util.UUID;

public class Warehouse {
    private String warehouseId;
    private Inventory inventory;
    private Address address;

    public Warehouse() {
        warehouseId = UUID.randomUUID().toString();
    }

    public void addItemToInventory(Product product) {
        inventory.addProduct(product);
    }

    public void addItemsToInventory(Map<String,Integer> productVsCount) {
        inventory.addProducts(productVsCount);
    }

    public void removeItemFromInventory(Map<String,Integer> productVsCount) {
        inventory.removeProduct(productVsCount);
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
