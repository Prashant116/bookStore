package com.Prashant.bookStore.controller;

import com.Prashant.bookStore.controller.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class BookController {
    @GetMapping("/getBooks")
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book = BookDto.builder()
                .title("100 miles")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
