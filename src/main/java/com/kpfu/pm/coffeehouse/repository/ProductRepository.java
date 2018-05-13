package com.kpfu.pm.coffeehouse.repository;


import com.kpfu.pm.coffeehouse.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
