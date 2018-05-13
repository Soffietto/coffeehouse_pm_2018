package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
