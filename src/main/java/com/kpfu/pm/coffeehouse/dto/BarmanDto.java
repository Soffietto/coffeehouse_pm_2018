package com.kpfu.pm.coffeehouse.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BarmanDto {

    private String name;
    private String surname;
    private Long coffeeHouseId;
}
