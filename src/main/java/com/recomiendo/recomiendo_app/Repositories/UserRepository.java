package com.recomiendo.recomiendo_app.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recomiendo.recomiendo_app.Entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
