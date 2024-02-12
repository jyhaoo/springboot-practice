package com.jyhaoo.jdbctemplate;

import com.jyhaoo.jdbctemplate.domain.Author;
import com.jyhaoo.jdbctemplate.domain.Book;

public final class TestDataUtil {

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Tom Harold")
                .age(56)
                .build();
    }

    public static Book createTestBook(final Author author) {
        return Book.builder()
                .isbn("818-1-2034-5033-0")
                .title("Percy Jakeson")
                .author(author)
                .build();
    }
}
