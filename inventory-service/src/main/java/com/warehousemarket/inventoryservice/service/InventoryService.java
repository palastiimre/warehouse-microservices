package com.warehousemarket.inventoryservice.service;

import com.warehousemarket.inventoryservice.interfaces.IInventoryService;
import com.warehousemarket.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService implements IInventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode(skuCode).isPresent();

    }
}
