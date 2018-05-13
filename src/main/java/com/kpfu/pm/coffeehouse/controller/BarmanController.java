package com.kpfu.pm.coffeehouse.controller;

import com.kpfu.pm.coffeehouse.dto.BarmanDto;
import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import com.kpfu.pm.coffeehouse.service.OrderService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class BarmanController extends ResponseCreator {

    @Autowired
    private BarmanService barmanService;

    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/{coffehouseId}", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> addBarman(@RequestBody BarmanDto barmanDto,
                                                         @PathVariable long coffeehouseId) {
        barmanService.createBarman(barmanDto,coffeehouseId);
        return createGoodResponse();
    }

    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/{id}", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> deleteBarman(@PathVariable long id) {
        barmanService.deleteBarman(id);
        return createGoodResponse();
    }


    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/{coffeehouseId}", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<BarmanResponseDto>>> getBarmans(@PathVariable long coffeehouseId) {

        return createGoodResponse(barmanService.getAllByCoffeeHouseId(coffeehouseId));
    }
}
