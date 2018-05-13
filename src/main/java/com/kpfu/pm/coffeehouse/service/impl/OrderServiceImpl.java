package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.converter.OrderConverter;
import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.entity.Order;
import com.kpfu.pm.coffeehouse.entity.User;
import com.kpfu.pm.coffeehouse.entity.enums.OrderState;
import com.kpfu.pm.coffeehouse.repository.OrderRepository;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import com.kpfu.pm.coffeehouse.service.OrderService;
import com.kpfu.pm.coffeehouse.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private CoffeeHouseService coffeeHouseService;
    
    @Override
    public void createOrder(OrderDto orderDto) {
        Order order = new Order();

//                order.setOwner(securityService.getCurrentUser());
//        Long coffeehouseId = orderDto.getOrdersCoffeehouseId();
//        order.setCoffeeHouse(coffeeHouseService.findOneById(coffeehouseId));
//
//        order.setOwner(new User("dsc","ddc","dc"));
//        order.setCoffeeHouse(new CoffeeHouse());
       order.setOrderState(OrderState.IN_PROCESS);


        orderRepository.save(order);
    }

    @Override
    public List<OrderResponseDto> getAllByCoffeeHouseId(Long coffeeHouseId) {
        List<Order> orders = orderRepository.getAllByCoffeeHouseId(coffeeHouseId);
        return orders.stream().map(OrderConverter::toOrderResponseDto).
                collect(Collectors.toList());
    }
    
}
