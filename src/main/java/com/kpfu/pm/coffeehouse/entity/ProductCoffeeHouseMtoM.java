package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_coffeehouse_mtom")
public class ProductCoffeeHouseMtoM extends AbstractEntity {

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "coffeehouse_id")
    private Long coffeehouseId;

}
