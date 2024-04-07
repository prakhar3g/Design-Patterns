package InventoryorManegementSystem;

import java.util.List;

public interface WarehouseSelectionStrategy {
    Warehouse selectWareHouse(List<Warehouse> warehouses);
}
