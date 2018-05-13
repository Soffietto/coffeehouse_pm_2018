package com.kpfu.pm.coffeehouse.controller;

import com.kpfu.pm.coffeehouse.dto.ProductDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.dto.response.ProductResponseDto;
import com.kpfu.pm.coffeehouse.service.ProductService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController extends ResponseCreator {

    @Autowired
    ProductService productService;


//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/product/{coffeehouseId}", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createProduct(@RequestBody ProductDto productDto, @PathVariable long coffeehouseId) {
        try{
        productService.createProduct(productDto,coffeehouseId);
    } catch (Exception e) {
        return createBadResponse(e.getMessage());
    }
        return createGoodResponse();
    }

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/product/{coffeehouseId}", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<ProductResponseDto>>> getProductsByCoffeeHouse(@PathVariable long coffeehouseId) {

        return createGoodResponse(productService.getAllByCoffeeHouse(coffeehouseId));
    }

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
//    @RequestMapping(value = "/product/{productId}/coffeehouse/{coffeehouseId}", method = RequestMethod.POST)
//    public ResponseEntity<ApiResponse<String>> deleteProductFromCoffeeHouse(@PathVariable long productId,
//                                                                            @PathVariable long coffeehouseId) {
//        try{
//            productService.deleteProduct(productDto,coffeehouseId);
//        } catch (Exception e) {
//            return createBadResponse(e.getMessage());
//        }
//        return createGoodResponse();
//    }


}
