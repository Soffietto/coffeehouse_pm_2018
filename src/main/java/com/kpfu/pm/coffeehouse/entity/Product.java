package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends AbstractEntity{

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="product_order_mtom", joinColumns = {
            @JoinColumn(name = "product_id",nullable = true, updatable = false) },
            inverseJoinColumns = {@JoinColumn(name = "order_id",
            nullable = true,updatable = false)})
    private Set<Order> orders;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="product_coffeehouse_mtom", joinColumns = {
            @JoinColumn(name = "product_id",nullable = true, updatable = false) },
            inverseJoinColumns = {@JoinColumn(name = "coffeehouse_id",
                    nullable = true,updatable = false)})
    private Set<CoffeeHouse> productscoffeeHouses;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private String price;

    @Column(name = "description", nullable = false)
    private String description;



}
