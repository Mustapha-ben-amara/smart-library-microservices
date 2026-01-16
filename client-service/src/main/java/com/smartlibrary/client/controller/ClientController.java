package com.smartlibrary.client.controller;

import com.smartlibrary.client.dto.BookDTO;
import com.smartlibrary.client.entity.Client;
import com.smartlibrary.client.feign.BookClient;
import com.smartlibrary.client.repository.ClientRepository;
import com.smartlibrary.client.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller exposant les API REST pour le microservice Client.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;
    private final  ClientService clientService;

    public ClientController(ClientRepository clientRepository, ClientService clientService)
    {
        this.clientRepository = clientRepository;
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients()
    {
        return clientRepository.findAll();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client)
    {
        return clientRepository.save(client);
    }

    /**
     * Endpoint qui appelle le Book Service via Feign
     */
    @GetMapping("/clients/books/{isbn}")
    public BookDTO getBookForClient(@PathVariable String isbn) {

        return clientService.getBookByIsbn(isbn);
    }
}
