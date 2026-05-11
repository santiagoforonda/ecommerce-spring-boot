package com.santyman.microservices.cart_microservices.product;

public record ProductResponse(
    Integer id,
    String name,
    String description,
    Double price,
    Integer stock,
    String imageURl,
    Integer categoryId,
    String categoryName,
    String categoryDescription
) {
    
}
