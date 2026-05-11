package com.santiago.microservices.customer_microservice.customer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.santiago.microservices.customer_microservice.exceptions.CustomerNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
    
    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    public String createCustomer(CustomerRequest request){
        CustomerEntity customer = mapper.toCustomerEntity(request);
        CustomerEntity savedCustomer = repository.save(customer);
        return savedCustomer.getId();
    }

    public CustomerResponse getCustomerById(String customerId) {
        CustomerEntity customerEntity = repository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
        return mapper.toCustomerResponse(customerEntity);        
    }

    public List<CustomerResponse> getCustomers() {
        return repository.findAll().stream().map(mapper::toCustomerResponse).toList();
    }

    public void updateCustomer(CustomerRequest request) {
        CustomerEntity customerEntity = mapper.toCustomerEntity(request);
        repository.save(customerEntity);
    }

    public void deleteCustomerById(String customerId) {
        repository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
        repository.deleteById(customerId);
    }   
}