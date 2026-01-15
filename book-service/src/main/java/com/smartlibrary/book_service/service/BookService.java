package com.smartlibrary.bookservice.service;

import com.smartlibrary.bookservice.entity.Book;
import com.smartlibrary.bookservice.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service métier pour la gestion des livres
 */
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Ajouter un livre
     */
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Récupérer tous les livres
     */
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    /**
     * Récupérer un livre par ISBN
     */
    public Book findByIsbn(String isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }
}
