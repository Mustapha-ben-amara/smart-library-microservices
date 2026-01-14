package com.smartlibrary.client.repository;

import com.smartlibrary.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour gérer les opérations CRUD sur les clients.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
