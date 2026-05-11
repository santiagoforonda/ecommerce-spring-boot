package com.santiago.microservices.product_microservice.product;

import lombok.Builder;

@Builder
public record ProductResponse(
    Integer id,
    String name,
    String description,
    Double price,
    Integer stock,
    String imageUrl,
    Integer categoryId,
    String categoryName,
    String categoryDescription
) {
    
}
