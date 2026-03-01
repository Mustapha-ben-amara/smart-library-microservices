package com.smartlibrary.book_service.controller;

import com.smartlibrary.book_service.entity.Book;
import com.smartlibrary.book_service.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
   // @GetMapping
   // public List<Book> getAll() {
      //  return bookService.findAll();
 // }

    @GetMapping
    public Page<Book> getAll(Pageable pageable) {
        return bookService.findAll(pageable);
    }
    /**
     * Trouver un livre par ISBN
     */
    @GetMapping("/{isbn}")
    public Book getByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }

    @GetMapping("/admin/test")
    public String adminTest() {
        return "ADMIN ACCESS OK";
    }
}
