package com.kpfu.pm.coffeehouse.entity;

import com.kpfu.pm.coffeehouse.entity.enums.OrderState;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "coffeehouse_id")
    private CoffeeHouse coffeeHouse;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

}
