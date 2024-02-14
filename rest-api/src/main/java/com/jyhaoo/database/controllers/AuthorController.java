package com.jyhaoo.database.controllers;

import com.jyhaoo.database.domain.entities.AuthorEntity;
import com.jyhaoo.database.domain.dto.AuthorDto;
import com.jyhaoo.database.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @PostMapping(path = "/authors")
    public AuthorDto createAuthor(@RequestBody AuthorDto author) {
        return authorService.createAuthor(author);
    }
}
