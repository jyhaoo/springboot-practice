package com.jyhaoo.jdbctemplate.dao;

import com.jyhaoo.jdbctemplate.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);

    void update(String isbn, Book book);
}
