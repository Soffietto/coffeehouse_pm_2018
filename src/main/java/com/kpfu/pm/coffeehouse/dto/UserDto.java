package com.kpfu.pm.coffeehouse.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto extends SignInDto{

    private String phoneNumber;
}
