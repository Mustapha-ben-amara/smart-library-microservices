package com.smartlibrary.client.feign;

import com.smartlibrary.client.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Client Feign pour appeler le microservice Book
 */
@FeignClient(
        name = "book-service",
        fallback = BookClientFallback.class
)
public interface BookClient {

    /**
     * Appel REST vers Book Service
     */
    @GetMapping("/books/{isbn}")
    BookDto getBookByIsbn(@PathVariable("isbn") String isbn);

    @GetMapping("/books")
    List<BookDto> getBooks();
}



