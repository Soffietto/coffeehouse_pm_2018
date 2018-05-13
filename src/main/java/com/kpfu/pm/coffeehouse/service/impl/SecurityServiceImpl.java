package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.entity.User;
import com.kpfu.pm.coffeehouse.service.SecurityService;
import com.kpfu.pm.coffeehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    UserService userService;

    @Override
    public User getCurrentUser() {
        return userService.findOneByUsername(getCurrentUserUsername());
    }

    private String getCurrentUserUsername() {
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        return (String) token.getPrincipal();
    }

}
