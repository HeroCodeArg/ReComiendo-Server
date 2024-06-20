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

import com.recomiendo.recomiendo_app.Entities.Store;
import com.recomiendo.recomiendo_app.Repositories.StoreRepository;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable String id) {
        return storeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Store whit ID "+id+" not found."));
    }

    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeRepository.save(store);
    }

    @PutMapping("/{id}")
    public Store updateStore(@PathVariable String id, @RequestBody Store updatedStore) {

        Store store = storeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Store whit ID "+id+" not found."));
        
        store.setName(updatedStore.getName());
        store.setAddress(updatedStore.getAddress());
        store.setCity(updatedStore.getCity());
        store.setState(updatedStore.getState());
        store.setZipcode(updatedStore.getZipcode());
        store.setEmail(updatedStore.getEmail());
        store.setPhone(updatedStore.getPhone());
        store.setDescription(updatedStore.getDescription());
        store.setRating(updatedStore.getRating());
        store.setVegan(updatedStore.isVegan());
        store.setVegetarian(updatedStore.isVegetarian());
        store.setGlutenFree(updatedStore.isGlutenFree());
        store.setLactoseFree(updatedStore.isLactoseFree());

        store.getSocialMedia().addAll(updatedStore.getSocialMedia());
        store.getImages().addAll(updatedStore.getImages());
        store.getReviews().addAll(updatedStore.getReviews());
        store.getProducts().addAll(updatedStore.getProducts());
    
        return storeRepository.save(store);
    }

    @DeleteMapping("/{id}")
    public Store deleteStore(@PathVariable String id) {
        Store store = storeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Store whit ID "+id+" not found."));
            
        storeRepository.deleteById(id);
        return store;
    }
}
