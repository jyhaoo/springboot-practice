package com.jyhaoo.database.services.impl;

import com.jyhaoo.database.domain.entities.AuthorEntity;
import com.jyhaoo.database.repositories.AuthorRepository;
import com.jyhaoo.database.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
