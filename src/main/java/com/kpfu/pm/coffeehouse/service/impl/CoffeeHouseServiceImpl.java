package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.repository.CoffeeHouseRepository;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeHouseServiceImpl implements CoffeeHouseService {

    @Autowired
    private CoffeeHouseRepository coffeeHouseRepository;

    @Override
    public List<CoffeeHouse> getAll() {
        return coffeeHouseRepository.findAll();
    }

    @Override
    public CoffeeHouse findOneById(Long id) {
        return coffeeHouseRepository.getOne(id);
    }
}
