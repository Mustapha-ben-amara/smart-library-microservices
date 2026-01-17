

package com.smartlibrary.client.dto;

/**
 * DTO représentant un client.
 * Utilisé uniquement pour l’échange entre microservices.
 */
public class ClientDto {

    private Long id;
    private String name;

    public ClientDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
