package com.kpfu.pm.coffeehouse.converter;

import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.entity.Order;

public class OrderConverter {

    public static OrderResponseDto toOrderResponseDto(Order order) {
        OrderResponseDto orderResponseDto = new OrderResponseDto();
//        orderResponseDto.setOwnerId(order.getOwner().getId());
//        orderResponseDto.setOrdersCoffeehouseId(order.getCoffeeHouse().getId());

        orderResponseDto.setOwnerId(2L);
        orderResponseDto.setOrdersCoffeehouseId(1L);

        return orderResponseDto;
    }




}
