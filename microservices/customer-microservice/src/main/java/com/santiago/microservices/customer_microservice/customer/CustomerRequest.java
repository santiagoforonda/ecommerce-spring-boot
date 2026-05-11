package com.santiago.microservices.customer_microservice.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
    String id,

    @NotNull(message = "The first name is required")
    String firstName,

    @NotNull(message = "The last name is required")
    String lastName,

    @NotNull(message = "The email address is required")
    @Email(message = "Email is not valid")
    String email,
    String phoneNumber,
    String address,
    String city
) {
    
}
