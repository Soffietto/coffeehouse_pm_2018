package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;

import java.util.List;

public interface CoffeeHouseService {

    List<CoffeeHouse> getAll();

    CoffeeHouse findOneById(Long id);
}
