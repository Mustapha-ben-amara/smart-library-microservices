package com.smartlibrary.bookservice.repository;

import com.smartlibrary.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository JPA pour l'entité Book
 */
public interface BookRepository extends JpaRepository<Book, String> {
}
