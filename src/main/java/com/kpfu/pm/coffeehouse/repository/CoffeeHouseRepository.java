package com.kpfu.pm.coffeehouse.repository;


import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeHouseRepository extends JpaRepository<CoffeeHouse,Long> {
}
