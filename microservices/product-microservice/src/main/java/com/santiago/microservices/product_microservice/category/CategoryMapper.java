package com.santiago.microservices.product_microservice.category;

import org.springframework.stereotype.Component;

import com.santiago.microservices.product_microservice.product.ProductMapper;

@Component
public class CategoryMapper {
    
    private final ProductMapper mapper;

    public CategoryMapper(ProductMapper mapper){
        this.mapper=mapper;
    }

    public CategoryEntity toCategoryEntity(CategoryRequest request){
        return CategoryEntity.builder()
            .id(request.id())
            .name(request.name())
            .description(request.description())
            .build();
    }

    public CategoryResponse toCategoryResponse(CategoryEntity entity){
        return CategoryResponse.builder()
            .id(entity.getId())
            .name(entity.getName())
            .descripcion(entity.getDescription())
            .products(entity.getProducts().stream().map(mapper::toProductResponse).toList())
            .build();
    }
}
