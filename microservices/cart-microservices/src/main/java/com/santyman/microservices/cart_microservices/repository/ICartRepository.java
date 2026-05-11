package com.santyman.microservices.cart_microservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.santyman.microservices.cart_microservices.entities.CartEntity;

public interface ICartRepository extends MongoRepository<CartEntity,String> {
    
}
