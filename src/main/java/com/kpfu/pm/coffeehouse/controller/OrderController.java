package com.kpfu.pm.coffeehouse.controller;


import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.service.OrderService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController extends ResponseCreator {

    @Autowired
    private OrderService orderService;

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createOrder(@RequestBody OrderDto orderDto) {
        orderService.createOrder(orderDto);
        return createGoodResponse();
    }


//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/order/{coffeehouseId}", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<OrderResponseDto>>> getOrders(@PathVariable long coffeehouseId) {

        return createGoodResponse(orderService.getAllByCoffeeHouseId(coffeehouseId));
    }


}
