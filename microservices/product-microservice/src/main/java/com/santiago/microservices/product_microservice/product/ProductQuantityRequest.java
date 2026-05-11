package com.santiago.microservices.product_microservice.product;

import jakarta.validation.constraints.NotNull;

public record ProductQuantityRequest(
    @NotNull(message = "No puede ser nulo")
    Integer productId,

    @NotNull(message = "No puede ser nulo")
    Integer quantity
) {
    
}
