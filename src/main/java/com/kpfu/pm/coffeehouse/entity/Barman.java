package com.kpfu.pm.coffeehouse.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "barman")
public class Barman extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "coffeehouse_id")
    private CoffeeHouse coffeeHouse;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
}
