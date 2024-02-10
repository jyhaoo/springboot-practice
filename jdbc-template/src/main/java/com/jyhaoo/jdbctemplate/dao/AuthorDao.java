package com.jyhaoo.jdbctemplate.dao;

import com.jyhaoo.jdbctemplate.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

    void update(long l, Author author);
}
