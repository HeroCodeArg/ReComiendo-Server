package com.recomiendo.recomiendo_app.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private String location;
    private String [] image;
    private Store [] toDoStores;
    private Store [] favoriteStores;
    private Review [] reviews;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String[] getImage() {
        return image;
    }
    public void setImage(String[] image) {
        this.image = image;
    }
    public Store[] getToDoStores() {
        return toDoStores;
    }
    public void setToDoStores(Store[] toDoStores) {
        this.toDoStores = toDoStores;
    }
    public Store[] getFavoriteStores() {
        return favoriteStores;
    }
    public void setFavoriteStores(Store[] favoriteStores) {
        this.favoriteStores = favoriteStores;
    }
    public Review[] getReviews() {
        return reviews;
    }
    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    
}
