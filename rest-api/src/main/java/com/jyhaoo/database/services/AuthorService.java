package com.jyhaoo.database.services;

import com.jyhaoo.database.domain.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity author);

    List<AuthorEntity> findAll();
}
