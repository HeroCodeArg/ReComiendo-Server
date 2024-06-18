package com.recomiendo.recomiendo_app.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recomiendo.recomiendo_app.Entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
