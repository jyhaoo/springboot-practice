package com.jyhaoo.jdbctemplate;

import com.jyhaoo.jdbctemplate.domain.Author;
import com.jyhaoo.jdbctemplate.domain.Book;

public final class TestDataUtil {

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Tom Harold")
                .age(56)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("Jerry Hox")
                .age(56)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Jared Long")
                .age(56)
                .build();
    }

    public static Book createTestBookA(final Author author) {
        return Book.builder()
                .isbn("818-1-2034-5033-0")
                .title("Percy Jakeson")
                .author(author)
                .build();
    }

    public static Book createTestBookB(final Author author) {
        return Book.builder()
                .isbn("818-1-2034-5033-1")
                .title("Hamlet")
                .author(author)
                .build();
    }

    public static Book createTestBookC(final Author author) {
        return Book.builder()
                .isbn("818-1-2034-5033-2")
                .title("Great Water")
                .author(author)
                .build();
    }
}
