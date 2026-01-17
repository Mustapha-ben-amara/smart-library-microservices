package com.smartlibrary.client.controller;

import com.smartlibrary.client.dto.BookDto;
import com.smartlibrary.client.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller exposant les API REST pour le microservice Client.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/books")
    public List<BookDto> getBooksFromLibrary() {
        return clientService.getAvailableBooks();
    }
}
