package com.recomiendo.recomiendo_app.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recomiendo.recomiendo_app.Entities.Review;

public interface ReviewRepository extends MongoRepository<Review, String>{

}
