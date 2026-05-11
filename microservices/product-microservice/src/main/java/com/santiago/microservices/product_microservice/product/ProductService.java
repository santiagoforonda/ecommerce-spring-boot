package com.santiago.microservices.product_microservice.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.santiago.microservices.product_microservice.category.CategoryService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final CategoryService categoryService;
    private final ProductMapper mapper;



    @Transactional
    public void purchaseProduct(List<ProductQuantityRequest> request){
        for(ProductQuantityRequest item: request){
            
            ProductEntity product = repository.findById(item.productId()).orElseThrow();

            if(product.getStock()< item.quantity()){
                throw new RuntimeException("Error");
            }

            product.setStock(product.getStock() - item.quantity());
            repository.save(product);
        }


    }

    @Transactional
    public void restockProucts(List<ProductQuantityRequest> request){
        for(ProductQuantityRequest item:request){
            ProductEntity product = repository.findById(item.productId()).orElseThrow();

            if(item.quantity()<0){
                throw new RuntimeException("Error");
            }

            product.setStock(product.getStock()+item.quantity());
            repository.save(product);
        }
    }
}
