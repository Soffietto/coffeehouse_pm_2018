package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Barman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BarmanRepository extends JpaRepository<Barman,Long> {

    List<Barman> getAllByCoffeeHouseId(Long coffeeHouseId);
}
