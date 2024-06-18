package com.recomiendo.recomiendo_app.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recomiendo.recomiendo_app.Entities.Store;

public interface StoreRepository extends MongoRepository<Store, String>{

}
