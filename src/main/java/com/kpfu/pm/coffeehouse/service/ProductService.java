package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.ProductDto;
import com.kpfu.pm.coffeehouse.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getAllByCoffeeHouse(Long coffeeHouseId);

    void createProduct(ProductDto productDto, Long coffeehouseId) throws Exception;
}
