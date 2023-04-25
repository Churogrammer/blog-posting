package com.duniv.blog.domain.order.collection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineCollection {
    Integer collectionProductId;
    Integer collectionQuantity;
}
