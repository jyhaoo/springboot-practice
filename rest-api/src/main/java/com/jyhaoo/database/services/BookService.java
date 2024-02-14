package com.jyhaoo.database.services;

import com.jyhaoo.database.domain.entities.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity bookEntity);
}
