package com.warehousemarket.productservice.interfaces;

import com.warehousemarket.productservice.dto.ProductRequest;
import com.warehousemarket.productservice.dto.ProductResponse;

import java.util.List;

public interface IProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
