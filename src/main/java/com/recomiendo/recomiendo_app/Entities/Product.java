package com.recomiendo.recomiendo_app.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private Double price;
    private String description;
    private String image;
    private String category;
    private String storeId;
    private boolean vegan;
    private boolean vegetarian;
    private boolean glutenFree;
    private boolean lactoseFree;
    private boolean chefsRecommendation;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getStoreId() {
        return storeId;
    }
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    public boolean isVegan() {
        return vegan;
    }
    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public boolean isGlutenFree() {
        return glutenFree;
    }
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    public boolean isLactoseFree() {
        return lactoseFree;
    }
    public void setLactoseFree(boolean lactoseFree) {
        this.lactoseFree = lactoseFree;
    }
    public boolean isChefsRecommendation() {
        return chefsRecommendation;
    }
    public void setChefsRecommendation(boolean chefsRecommendation) {
        this.chefsRecommendation = chefsRecommendation;
    }

    
}
