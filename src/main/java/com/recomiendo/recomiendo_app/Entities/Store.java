package com.recomiendo.recomiendo_app.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "stores")
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String phone;
    private String description;
    //VER HORARIOS Y DIAS DE APERTURA
    private String [] socialMedia;
    private String [] images;
    private int rating; //Average rating 1 to 5.
    private boolean vegan; 
    private boolean vegetarian;
    private boolean glutenFree;
    private boolean lactoseFree;
    private Review [] reviews;
    private Product [] products;

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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String[] getSocialMedia() {
        return socialMedia;
    }
    public void setSocialMedia(String[] socialMedia) {
        this.socialMedia = socialMedia;
    }
    public String[] getImages() {
        return images;
    }
    public void setImages(String[] images) {
        this.images = images;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
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
    public Review[] getReviews() {
        return reviews;
    }
    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }


}
