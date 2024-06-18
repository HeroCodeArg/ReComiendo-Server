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

import com.recomiendo.recomiendo_app.Entities.Product;
import com.recomiendo.recomiendo_app.Repositories.ProductRepository;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product whit ID "+id+" not found."));
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product whit ID "+id+" not found."));
        
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        product.setDescription(updatedProduct.getDescription());
        product.setImage(updatedProduct.getImage());
        product.setCategory(updatedProduct.getCategory());
        product.setStoreId(updatedProduct.getStoreId());
        product.setVegan(updatedProduct.isVegan());
        product.setVegetarian(updatedProduct.isVegetarian());
        product.setGlutenFree(updatedProduct.isGlutenFree());
        product.setLactoseFree(updatedProduct.isLactoseFree());
        product.setChefsRecommendation(updatedProduct.isLactoseFree());

        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable String id) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product whit ID "+id+" not found."));

        productRepository.deleteById(id);
        return product;
    }
}
