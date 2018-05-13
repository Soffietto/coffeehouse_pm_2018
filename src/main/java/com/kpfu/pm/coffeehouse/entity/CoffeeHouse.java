package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coffeehouses")
public class CoffeeHouse extends AbstractEntity {

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "coffeeHouse")
     private Set<Manager> managers;

     @OneToMany(fetch = FetchType.LAZY,mappedBy = "coffeeHouse")
     private Set<Barman> barmans;

     @OneToMany(fetch = FetchType.LAZY,mappedBy = "coffeeHouse")
     private Set<Order> orders;

     @ManyToMany(fetch = FetchType.LAZY, mappedBy = "productscoffeeHouses")
     private Set<Product> products;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "coffeeHouse")
     private Set<CoffeeHouseComment> coffeeHouseComments;

}
