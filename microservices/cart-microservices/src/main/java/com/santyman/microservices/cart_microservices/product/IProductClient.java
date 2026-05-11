package com.santyman.microservices.cart_microservices.product;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PRODUCT-MICROSERVICE")
public interface IProductClient {
    

    @GetMapping("/api/v1/products/{id}")
    Optional<ProductResponse> getProductById(@PathVariable("id") Integer productId);
}
