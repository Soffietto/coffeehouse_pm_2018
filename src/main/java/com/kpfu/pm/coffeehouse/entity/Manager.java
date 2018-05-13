package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "managers")
public class Manager extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "coffehouse_id")
    private CoffeeHouse coffeeHouse;
}
