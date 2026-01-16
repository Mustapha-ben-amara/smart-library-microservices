package com.smartlibrary.client.feign;

import com.smartlibrary.client.dto.BookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Client Feign pour appeler le microservice Book
 */
@FeignClient(
        name = "book-service",
        url = "http://localhost:8082"
)
public interface BookClient {

    /**
     * Appel REST vers Book Service
     */
    @GetMapping("/books/{isbn}")
    BookDTO getBookByIsbn(@PathVariable("isbn") String isbn);
}
