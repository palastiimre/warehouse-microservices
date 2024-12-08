package com.warehousemarket.inventoryservice.interfaces;

import com.warehousemarket.inventoryservice.entities.Inventory;

public interface IInventoryService {
    boolean isInStock(String skuCode);
}
