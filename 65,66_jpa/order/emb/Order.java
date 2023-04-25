package com.blog.exdiary.domain.order.emb;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "orders")
@NoArgsConstructor
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer id;
    String name;

    @Embedded
    OrderEmb orderEmb;
    public Order(String name, OrderEmb emb){
        this.name = name;
        this.orderEmb = emb;
    }
}
