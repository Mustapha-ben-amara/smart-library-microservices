package com.smartlibrary.client.service;

import com.smartlibrary.client.dto.BookDto;
import com.smartlibrary.client.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service métier Client
 */
@Service
public class ClientService {

    private final BookClient bookClient;

    /**
     * Injection par constructeur (bonne pratique)
     */
    public ClientService(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    /**
     * Appelle le Book Service pour récupérer un livre
     */
    public BookDto getBookByIsbn(String isbn) {
        return bookClient.getBookByIsbn(isbn);
    }


    public List<BookDto> getAvailableBooks() {
        return bookClient.getAllBooks();
    }
}
