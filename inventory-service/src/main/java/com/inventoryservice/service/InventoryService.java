package com.inventoryservice.service;

import com.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isOnStock(List<String> skyCodes);
}
