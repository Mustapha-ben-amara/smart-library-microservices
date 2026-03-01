package com.smartlibrary.book_service.service;

import com.smartlibrary.book_service.entity.Book;
import com.smartlibrary.book_service.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
   // public List<Book> findAll() {
    //    return bookRepository.findAll();
  //  }


    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
    /**
     * Récupérer un livre par ISBN
     */
    public Book findByIsbn(String isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }
}
