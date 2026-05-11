package com.santiago.microservices.product_microservice.category;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    private final CategoryMapper mapper;

    public List<CategoryResponse> getAllCategories() {
        return repository.findAll().stream().map(mapper::toCategoryResponse).toList();
    }

    public Integer createCategory(CategoryRequest request) {
        CategoryEntity categoryEntity = mapper.toCategoryEntity(request);
        return repository.save(categoryEntity).getId();
    }


    
}
