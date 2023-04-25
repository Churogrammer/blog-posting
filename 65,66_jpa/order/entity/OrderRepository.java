package com.duniv.blog.domain.order.entity;

import com.duniv.blog.domain.order.emb.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
