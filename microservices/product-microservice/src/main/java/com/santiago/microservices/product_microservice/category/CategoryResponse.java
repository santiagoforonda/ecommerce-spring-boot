package com.santiago.microservices.product_microservice.category;

import java.util.List;

import com.santiago.microservices.product_microservice.product.ProductResponse;

import lombok.Builder;

@Builder
public record CategoryResponse(
    Integer id,
    String name,
    String descripcion,
    List<ProductResponse> products
) {
    
}
