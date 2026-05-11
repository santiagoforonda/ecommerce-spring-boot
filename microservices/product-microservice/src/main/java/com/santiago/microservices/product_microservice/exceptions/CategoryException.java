package com.santiago.microservices.product_microservice.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryException extends RuntimeException {
    
    public CategoryException(String message){
        super(message);
    }
}
