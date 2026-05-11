package com.santyman.microservices.cart_microservices.customer;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-MICROSERIVE")
public interface ICustomerClient {

    @GetMapping("/api/v1/customers/{id}")
    Optional<CustomerResponse> getCustomerById(@PathVariable("id") String customerId);
    
}
