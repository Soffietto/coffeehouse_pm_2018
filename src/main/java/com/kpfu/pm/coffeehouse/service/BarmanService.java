package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.BarmanDto;
import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.entity.Barman;

import java.util.List;

public interface BarmanService {

    void createBarman(BarmanDto barmanDto, Long coffeehouseId);

    List<BarmanResponseDto> getAllByCoffeeHouseId(Long coffeeHouseId);

    Barman findOneById(Long barmanId);

    void deleteBarman(Long id);
}
