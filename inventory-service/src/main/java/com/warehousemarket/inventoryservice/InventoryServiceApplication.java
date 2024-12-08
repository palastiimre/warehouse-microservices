package com.warehousemarket.inventoryservice;

import com.warehousemarket.inventoryservice.entities.Inventory;
import com.warehousemarket.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory0 = new Inventory();
            inventory0.setSkuCode("iphone-13");
            inventory0.setQuantity(10);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone-12-red");
            inventory1.setQuantity(0);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("iphone-13");
            inventory2.setQuantity(10);

            inventoryRepository.save(inventory0);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }

}
