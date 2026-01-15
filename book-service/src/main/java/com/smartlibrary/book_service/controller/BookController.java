package com.smartlibrary.bookservice.controller;

import com.smartlibrary.bookservice.entity.Book;
import com.smartlibrary.bookservice.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST pour les livres
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Ajouter un livre
     */
    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.save(book);
    }

    /**
     * Lister tous les livres
     */
    @GetMapping
    public List<Book> getAll() {
        return bookService.findAll();
    }

    /**
     * Trouver un livre par ISBN
     */
    @GetMapping("/{isbn}")
    public Book getByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }
}
