package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.UserDto;
import com.kpfu.pm.coffeehouse.entity.User;

public interface UserService {

    User findOneByUsername(String currentUserUsername);

    void createUser(UserDto userDto) throws Exception;
}
