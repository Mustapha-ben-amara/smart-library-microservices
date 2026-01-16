package com.smartlibrary.client.service;

import com.smartlibrary.client.dto.BookDTO;
import com.smartlibrary.client.feign.BookClient;
import org.springframework.stereotype.Service;

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
    public BookDTO getBookByIsbn(String isbn) {
        return bookClient.getBookByIsbn(isbn);
    }
}
