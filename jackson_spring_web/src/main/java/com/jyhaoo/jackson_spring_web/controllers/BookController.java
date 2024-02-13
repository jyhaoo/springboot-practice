package com.jyhaoo.jackson_spring_web.controllers;

import com.jyhaoo.jackson_spring_web.domain.Book;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class BookController {
    @GetMapping(path = "/books")
    public Book retrieveBook() {
        return Book.builder()
                .isbn("978-6-13-472353-5")
                .title("The Water of Islands")
                .author("Jeff Probst")
                .yearPublished("2004")
                .build();
    }

    @PostMapping(path = "/books")
    public Book createBook(@RequestBody final Book book) {
        log.info("Got book: " + book.toString());
        return book;
    }
}
