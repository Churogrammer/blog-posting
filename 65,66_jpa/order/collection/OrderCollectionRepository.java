package com.duniv.blog.domain.order.collection;

import com.duniv.blog.domain.order.emb.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCollectionRepository extends JpaRepository<OrderCollection, Integer> {
}
