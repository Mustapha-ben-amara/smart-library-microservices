package com.smartlibrary.client.controller;

import com.smartlibrary.client.entity.Client;
import com.smartlibrary.client.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller exposant les API REST pour le microservice Client.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
