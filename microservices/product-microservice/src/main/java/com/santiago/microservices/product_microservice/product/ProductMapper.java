package com.santiago.microservices.product_microservice.product;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    
    public ProductResponse toProductResponse(ProductEntity entity){
        return ProductResponse.builder()
        .id(entity.getId())
        .name(entity.getName())
        .description(entity.getDescription())
        .price(entity.getPrice())
        .stock(entity.getStock())
        .imageUrl(entity.getImageUrl())
        .categoryId(entity.getCategory().getId())
        .categoryName(entity.getCategory().getName())
        .categoryDescription(entity.getCategory().getDescription())
        .build();
    }

    
}
