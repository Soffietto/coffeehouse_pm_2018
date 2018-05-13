package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.CoffeeHouseComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeHouseCommentReposiory extends JpaRepository<CoffeeHouseComment,Long> {
}
