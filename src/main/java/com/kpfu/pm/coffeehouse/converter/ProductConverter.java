package com.kpfu.pm.coffeehouse.converter;

import com.kpfu.pm.coffeehouse.dto.response.ProductResponseDto;
import com.kpfu.pm.coffeehouse.entity.Product;

public class ProductConverter {

    public static ProductResponseDto toProductResponseDto(Product product) {
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setDescription(product.getDescription());
        productResponseDto.setName(product.getName());
        productResponseDto.setPrice(product.getPrice());
        return productResponseDto;
    }
}
