package InventoryorManegementSystem;

import java.util.List;

public class NearestWarehouseSelectionStrategy implements WarehouseSelectionStrategy{
    @Override
    public Warehouse selectWareHouse(List<Warehouse> warehouses) {
        return warehouses.get(0);
    }
}
