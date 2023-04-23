package com.duniv.blog.domain.order;

import com.duniv.blog.domain.order.entity.OrderEntity;
import com.duniv.blog.domain.order.entity.OrderLineEntity;
import com.duniv.blog.domain.order.entity.OrderLineRepository;
import com.duniv.blog.domain.order.entity.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderLineRepository orderLineRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void 엔티티_오더_테스트(){
        OrderEntity order = orderRepository.findById(999).orElse(new OrderEntity("엔티티 테스트"));
        orderRepository.save(order);

        OrderLineEntity line1 = new OrderLineEntity(1,2);
        OrderLineEntity line2 = new OrderLineEntity(2,3);
        OrderLineEntity line3 = new OrderLineEntity(3,4);

        order.addOrders(line1);
        order.addOrders(line2);
        order.addOrders(line3);

        orderLineRepository.save(line1);
        orderLineRepository.save(line2);
        orderLineRepository.save(line3);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void 엔티티_오더라인_테스트(){
        OrderEntity order = orderRepository.findById(999).orElse(new OrderEntity("엔티티 테스트2"));
        orderRepository.save(order);

        OrderLineEntity line1 = new OrderLineEntity(1,2);
        OrderLineEntity line2 = new OrderLineEntity(2,3);
        OrderLineEntity line3 = new OrderLineEntity(3,4);

        line1.addOrder(order);
        line2.addOrder(order);
        line3.addOrder(order);

        orderLineRepository.save(line1);
        orderLineRepository.save(line2);
        orderLineRepository.save(line3);
    }

}