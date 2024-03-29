package com.jyhaoo.jdbctemplate.dao;

import com.jyhaoo.jdbctemplate.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long id);

    void update(long id, Author author);

    void delete(long id);
}
