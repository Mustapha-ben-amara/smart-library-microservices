package com.smartlibrary.book_service.repository;

import com.smartlibrary.book_service.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository JPA pour l'entité Book
 */
public interface BookRepository extends JpaRepository<Book, String> {
}
