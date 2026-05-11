package com.santiago.microservices.customer_microservice.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.santiago.microservices.common_exceptions.ErrorResponse;
import com.santiago.microservices.common_exceptions.GlobalExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice(basePackages = "com.santiago.microservices.customer_microservice")
@Primary
@Slf4j
public class CustomerExceptionHandler extends GlobalExceptionHandler{
    
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(CustomerNotFoundException exception){
        Map<String,String> errors = new HashMap<>();
        String fieldName = "custonmer";
        errors.put(fieldName, fieldName);
        log.warn("Customer not found: {}", exception.toString());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors));
    }
}
