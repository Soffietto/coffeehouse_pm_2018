package com.kpfu.pm.coffeehouse.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInDto {

    private String username;
    private String password;
}
