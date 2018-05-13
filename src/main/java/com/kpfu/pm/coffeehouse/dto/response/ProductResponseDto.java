package com.kpfu.pm.coffeehouse.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponseDto {

    private String description;
    private String price;
    private String name;
}
