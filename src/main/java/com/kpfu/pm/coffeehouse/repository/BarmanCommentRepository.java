package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.BarmanComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarmanCommentRepository extends JpaRepository<BarmanComment, Long> {
}
