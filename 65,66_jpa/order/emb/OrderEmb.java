package com.duniv.blog.domain.order.emb;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class OrderEmb {
    Integer embProductId;
    Integer embQuantity;
}
