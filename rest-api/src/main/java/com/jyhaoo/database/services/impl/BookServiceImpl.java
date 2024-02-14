package com.jyhaoo.database.services.impl;

import com.jyhaoo.database.domain.entities.BookEntity;
import com.jyhaoo.database.repositories.BookRepository;
import com.jyhaoo.database.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }
}
