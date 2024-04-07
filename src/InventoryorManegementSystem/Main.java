package InventoryorManegementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //CreateWareHouse
        Warehouse warehouse = new Warehouse();

        Inventory inventory = new Inventory();
        //CreateProducts
        Product product1 = new Product("Coca Cola",100,10);
        Product product2 = new Product("Dove Shampoo",50,10);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        warehouse.setInventory(inventory);

        Address warehouseAddress = new Address("YXZ","Bangalore","Karnataka","India","560103");
        warehouse.setAddress(warehouseAddress);

        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouse);

        //Creating Users
        Address userAddress = new Address("ABC","Mainpuri","Up","India","205001");
        User user1 = new User("Ashu",userAddress);
        List<User> userList = new ArrayList<>();
        userList.add(user1);

        ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(warehouseList,userList);

        //Placing Order
        User user = productDeliverySystem.getUser(user1.getUserId());
        Warehouse warehouse1 = productDeliverySystem.getWareHouse(new NearestWarehouseSelectionStrategy());


    }
}
