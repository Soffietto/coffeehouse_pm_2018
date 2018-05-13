package com.kpfu.pm.coffeehouse.converter;

import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.entity.Barman;

public class BarmanConverter {

    public static BarmanResponseDto toBarmanResponseDto(Barman barman) {
        BarmanResponseDto barmanResponseDto = new BarmanResponseDto();
        barmanResponseDto.setId(barman.getId());
        barmanResponseDto.setName(barman.getName());
        barmanResponseDto.setSurname(barman.getSurname());
        return barmanResponseDto;
    }
}
