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

import com.recomiendo.recomiendo_app.Repositories.UserRepository;
import com.recomiendo.recomiendo_app.Entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User whit ID "+id+" not found."));
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User whit ID "+id+" not found."));
    
        user.setName(updatedUser.getName());
        user.setSurname(updatedUser.getSurname());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        user.setPhone(updatedUser.getPhone());
        user.setLocation(updatedUser.getLocation());
        
        //Collections update.
        user.getImages().addAll(updatedUser.getImages());
        user.getToDoStores().addAll(updatedUser.getToDoStores());
        user.getFavoriteStores().addAll(updatedUser.getFavoriteStores());
        user.getReviews().addAll(updatedUser.getReviews());

        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable String id) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User whit ID "+id+" not found."));

        userRepository.delete(user);
        return user;
    }
}
