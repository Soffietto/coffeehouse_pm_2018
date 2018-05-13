package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.converter.ProductConverter;
import com.kpfu.pm.coffeehouse.dto.ProductDto;
import com.kpfu.pm.coffeehouse.dto.response.ProductResponseDto;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.entity.Product;
import com.kpfu.pm.coffeehouse.repository.ProductRepository;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import com.kpfu.pm.coffeehouse.service.ProductService;
import com.kpfu.pm.coffeehouse.util.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CoffeeHouseService coffeeHouseService;

    @Override
    public void createProduct(ProductDto productDto, long coffeehouseId) throws Exception{
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());

        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeehouseId);

        if(coffeeHouse.getProducts().contains(product)) {
            throw new Exception(Errors.PRODUCT_ALREADY_EXISTS);
        }

        Set<CoffeeHouse> coffeeHouseSet = new HashSet<>();
        coffeeHouseSet.add(coffeeHouse);


        product.setProductscoffeeHouses(coffeeHouseSet);
        productRepository.save(product);
    }

    @Override
    public List<ProductResponseDto> getAllByCoffeeHouse(long coffeeHouseId) {
        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeeHouseId);
        return coffeeHouse.getProducts().stream().map(ProductConverter::toProductResponseDto).
                collect(Collectors.toList());
    }
}
