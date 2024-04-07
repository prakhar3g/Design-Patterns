package InventoryorManegementSystem;

import java.util.List;

public class WarehouseController {
    private List<Warehouse> warehouses;

    public WarehouseController(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    private void addNewWareHouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse){
        warehouses.remove(warehouse);
    }

    public Warehouse selectWareHouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return warehouseSelectionStrategy.selectWareHouse(warehouses);
    }

}
