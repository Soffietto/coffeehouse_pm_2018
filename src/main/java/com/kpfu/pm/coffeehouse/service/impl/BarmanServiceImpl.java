package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.converter.BarmanConverter;
import com.kpfu.pm.coffeehouse.dto.BarmanDto;
import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.entity.Barman;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.repository.BarmanRepository;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BarmanServiceImpl implements BarmanService {

    @Autowired
    private BarmanRepository barmanRepository;

    @Autowired
    private CoffeeHouseService coffeeHouseService;

    @Override
    public void createBarman(BarmanDto barmanDto, Long coffeehouseId) {
        Barman barman = new Barman();
        barman.setName(barmanDto.getName());
        barman.setSurname(barmanDto.getSurname());
        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeehouseId);
        barman.setCoffeeHouse(coffeeHouse);

        barmanRepository.save(barman);
    }

    @Override
    public List<BarmanResponseDto> getAllByCoffeeHouseId(Long coffeeHouseId) {
        List<Barman> barmen = barmanRepository.getAllByCoffeeHouseId(coffeeHouseId);
        return barmen.stream().map(BarmanConverter::toBarmanResponseDto).
                collect(Collectors.toList());
    }

    @Override
    public Barman findOneById(Long barmanId) {
        return barmanRepository.getBarmanById(barmanId);
    }

    @Override
    public void deleteBarman(Long id) {
        barmanRepository.deleteById(id);
    }
}
