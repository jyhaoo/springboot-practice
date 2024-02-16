package com.jyhaoo.database.services;

import com.jyhaoo.database.domain.entities.BookEntity;

import java.util.List;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity bookEntity);

    List<BookEntity> findAll();
}
