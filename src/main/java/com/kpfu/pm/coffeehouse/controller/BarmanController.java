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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BarmanController extends ResponseCreator {

    @Autowired
    private BarmanService barmanService;

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/save/{coffeehouseId}", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> addBarman(@RequestBody BarmanDto barmanDto,
                                                         @PathVariable long coffeehouseId) {
        barmanService.createBarman(barmanDto,coffeehouseId);
        return createGoodResponse();
    }

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/delete/{barmanId}", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<String>> deleteBarman(@PathVariable long barmanId) {
        barmanService.deleteBarman(barmanId);
        return createGoodResponse();
    }


//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/barman/coffeehouse/{coffeehouseId}", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<BarmanResponseDto>>> getBarmansByCoffeeHouseId(@PathVariable long coffeehouseId) {

        return createGoodResponse(barmanService.getAllByCoffeeHouseId(coffeehouseId));
    }
}
