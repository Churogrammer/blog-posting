package com.duniv.blog.domain.order.collection;

import com.duniv.blog.domain.order.emb.OrderEmb;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "order_collection")
@NoArgsConstructor
public class OrderCollection {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer id;
    String name;

    @ElementCollection
    @CollectionTable(name = "order_line_collection", joinColumns = @JoinColumn(name = "order_collection_id"))
    List<OrderLineCollection> orderValues = new ArrayList<>();

    public OrderCollection(String name){
        this.name = name;
    }

    public void addOrderLine(OrderLineCollection orderLine){
        orderValues.add(orderLine);
    }

}
