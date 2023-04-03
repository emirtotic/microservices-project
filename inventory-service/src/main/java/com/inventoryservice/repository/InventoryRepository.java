package com.inventoryservice.repository;

import com.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    //Optional<Inventory> findBySkyCodeAndQuantityIsGreaterThan(String skyCode, int quantity);
    List<Inventory> findBySkyCodeIn(List<String> skyCode);

}
