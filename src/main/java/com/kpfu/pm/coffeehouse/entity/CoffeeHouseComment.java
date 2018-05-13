package com.kpfu.pm.coffeehouse.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coffeehouse_comments")
public class CoffeeHouseComment extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "coffeehouse_id")
    private CoffeeHouse coffeeHouse;

    @Column(name = "comment")
    private String comment;
}
