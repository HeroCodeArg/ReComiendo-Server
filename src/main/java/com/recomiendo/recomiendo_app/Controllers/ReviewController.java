package com.recomiendo.recomiendo_app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recomiendo.recomiendo_app.Entities.Review;
import com.recomiendo.recomiendo_app.Repositories.ReviewRepository;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable String id) {
        return reviewRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Review whit ID "+id+" not found"));
    }

    @PostMapping
    public Review createReview(@RequestBody Review newReview) {
        return reviewRepository.save(newReview);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable String id, @RequestBody Review updatedReview) {
        Review review = reviewRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Review whit ID "+id+" not found"));

        review.setMessage(updatedReview.getMessage());
        review.setRating(updatedReview.getRating());
        review.setUserId(updatedReview.getUserId());
        review.setStoreId(updatedReview.getStoreId());

        return reviewRepository.save(review);
    }    

    @DeleteMapping("/{id}")
    public Review deleteReview(@PathVariable String id) {
        Review review = reviewRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Review whit ID "+id+" not found"));

        reviewRepository.deleteById(id);
        return review;
    }
}
