package com.duniv.blog.domain.order.entity;

import com.duniv.blog.domain.order.emb.OrderEmb;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "order_entity")
@NoArgsConstructor
public class OrderEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer id;
    String name;

    @OneToMany(mappedBy = "order")
    List<OrderLineEntity> orders = new ArrayList<>();

    public void addOrders(OrderLineEntity orderLine){
        orders.add(orderLine);
    }
    public OrderEntity(String name){
        this.name = name;
    }
}
