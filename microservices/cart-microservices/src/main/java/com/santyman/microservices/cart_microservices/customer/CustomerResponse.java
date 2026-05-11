package com.santyman.microservices.cart_microservices.customer;

public record CustomerResponse(
    String id,
    String firstName,
    String lastName,
    String email,
    String phone,
    String address,
    String city
) {
    
}
