package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.dto.UserDto;
import com.kpfu.pm.coffeehouse.entity.User;
import com.kpfu.pm.coffeehouse.repository.UserRepository;
import com.kpfu.pm.coffeehouse.service.UserService;
import com.kpfu.pm.coffeehouse.util.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }


    @Override
    public User findOneByUsername(String currentUserUsername) {
        return userRepository.findOneByUsername(currentUserUsername);
    }

    @Override
    public void createUser(UserDto userDto) throws Exception {
        String username = userDto.getUsername();

        if (this.findOneByUsername(username) != null) {
            throw new Exception(Errors.USER_ALREADY_EXISTS);
        }

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());
        userRepository.save(user);
    }
}
