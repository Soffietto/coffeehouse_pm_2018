package com.kpfu.pm.coffeehouse.controller;

import com.kpfu.pm.coffeehouse.dto.CommentDto;
import com.kpfu.pm.coffeehouse.dto.response.CommentResponseDto;
import com.kpfu.pm.coffeehouse.service.CommentService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController extends ResponseCreator {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment/coffeeHouse", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createCommentOfCoffeeHouse(@RequestBody CommentDto commentDto){

            commentService.createCommentOfCoffeeHouse(commentDto);

        return createGoodResponse();
    }

    @RequestMapping(value = "/comment/barman", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createCommentOfBarman(@RequestBody CommentDto commentDto){

        commentService.createCommentOfBarman(commentDto);

        return createGoodResponse();
    }

//    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/comment/{coffeehouseId}/coffeehouse", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<CommentResponseDto>>> getCommentsOfCoffeeHouse(@PathVariable long coffeehouseId) {

        return createGoodResponse(commentService.getAllByCoffeeHouseId(coffeehouseId));
    }

 //    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/comment/{barmanId}/barman", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse<List<CommentResponseDto>>> getCommentsOfBarman(@PathVariable long barmanId) {

        return createGoodResponse(commentService.getAllByBarmanId(barmanId));
    }
}
