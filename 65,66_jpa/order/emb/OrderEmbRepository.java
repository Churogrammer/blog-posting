package com.duniv.blog.domain.order.emb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEmbRepository extends JpaRepository<Order, Integer> {
}
