package com.duniv.blog.domain.order.entity;

import com.duniv.blog.domain.order.emb.Order;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class OrderLineEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_line_id")
    Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEntity order;
    Integer entityProductId;
    Integer entityQuantity;

    public OrderLineEntity(Integer entityProductId, Integer entityQuantity){
        this.entityQuantity = entityQuantity;
        this.entityProductId = entityProductId;
        //addOrder(order);
    }
    public void addOrder(OrderEntity order){
        this.order = order;
    }
}
