
package com.smartlibrary.client.feign;

import org.springframework.stereotype.Component;
import java.util.List;
import com.smartlibrary.client.dto.BookDto;

@Component
public class BookClientFallback implements BookClient {

    @Override
    public List<BookDto> getBooks() {
        return List.of(
                new BookDto("N/A", "Service indisponible (fallback)")
        );
    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        return null;
    }


}
