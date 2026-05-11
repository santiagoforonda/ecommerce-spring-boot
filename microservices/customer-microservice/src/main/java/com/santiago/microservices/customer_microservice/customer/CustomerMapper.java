package com.santiago.microservices.customer_microservice.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    
    public CustomerEntity toCustomerEntity(CustomerRequest request){
        return CustomerEntity.builder()
            .id(request.id())
            .firstName(request.firstName())
            .lastName(request.lastName())
            .email(request.email())
            .phone(request.phoneNumber())
            .address(request.address())
            .city(request.city())
            .build();
    }

    public CustomerResponse toCustomerResponse(CustomerEntity customerEntity){
        return CustomerResponse.builder()
            .id(customerEntity.getId())
            .firstName(customerEntity.getFirstName())
            .lastName(customerEntity.getLastName())
            .email(customerEntity.getEmail())
            .phone(customerEntity.getPhone())
            .address(customerEntity.getAddress())
            .city(customerEntity.getCity())
            .build();
    }
}
