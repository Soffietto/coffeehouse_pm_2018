package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> getAllByCoffeeHouseId(Long id);
}
