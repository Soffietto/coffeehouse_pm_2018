package com.kpfu.pm.coffeehouse.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderResponseDto {

    private Long ownerId;
    private Long ordersCoffeehouseId;
}
