package com.smartlibrary.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Entité représentant un Livre
 */
@Entity
public class Book {

    /**
     * ISBN = identifiant unique du livre
     */
    @Id
    private String isbn;

    /**
     * Titre du livre
     */
    private String title;

    // Constructeur vide obligatoire pour JPA
    public Book() {}

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    // Getters & Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
