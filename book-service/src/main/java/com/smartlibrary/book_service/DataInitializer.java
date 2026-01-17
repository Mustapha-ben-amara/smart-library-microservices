
package com.smartlibrary.book_service;

import com.smartlibrary.book_service.entity.Book;
import com.smartlibrary.book_service.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.save(new Book("ISBN-001", "Clean Code"));
        bookRepository.save(new Book("ISBN-002", "Spring in Action"));
        bookRepository.save(new Book("ISBN-003", "Effective Java"));
    }
}
