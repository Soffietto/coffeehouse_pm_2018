package com.kpfu.pm.coffeehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_order_mtom")
public class ProductOrderMtoM extends AbstractEntity{

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "order_id")
    private Long orderId;
}
