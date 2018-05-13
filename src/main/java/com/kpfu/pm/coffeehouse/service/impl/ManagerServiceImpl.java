package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.repository.ManagerRepository;
import com.kpfu.pm.coffeehouse.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

}
