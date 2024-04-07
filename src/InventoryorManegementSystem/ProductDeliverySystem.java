package InventoryorManegementSystem;

import java.util.List;

public class ProductDeliverySystem {

    private UserController userController;
    private WarehouseController warehouseController;
    private OrderController orderController;

    public ProductDeliverySystem(List<Warehouse> warehouses,List<User> users) {
        warehouseController = new WarehouseController(warehouses);
        userController = new UserController(users);
        orderController = new OrderController();
    }

    public Warehouse getWareHouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return warehouseController.selectWareHouse(warehouseSelectionStrategy);
    }

    public Inventory getInventory(Warehouse warehouse) {
        return warehouse.getInventory();
    }

    public void addProductToCard(String userId,Product product,int units) {
        userController.getUser(userId).getCart().addItemInCart(product.getProductId(),units);
    }

    public User getUser(String userId) {
        return userController.getUser(userId);
    }
}
