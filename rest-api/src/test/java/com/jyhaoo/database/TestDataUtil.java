package com.jyhaoo.database;

import com.jyhaoo.database.domain.dto.BookDto;
import com.jyhaoo.database.domain.entities.AuthorEntity;
import com.jyhaoo.database.domain.entities.BookEntity;

public final class TestDataUtil {

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
                .id(1L)
                .name("Tom Harold")
                .age(80)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .id(2L)
                .name("Jerry Hox")
                .age(46)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .id(3L)
                .name("Jared Long")
                .age(37)
                .build();
    }

    public static BookEntity createTestBookA(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("818-1-2034-5033-0")
                .title("Percy Jakeson")
                .author(author)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("818-1-2034-5033-1")
                .title("Hamlet")
                .author(author)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity author) {
        return BookEntity.builder()
                .isbn("818-1-2034-5033-2")
                .title("Great Water")
                .author(author)
                .build();
    }

    public static BookDto createTestBookDto(final AuthorEntity author) {
        return BookDto.builder()
                .isbn("818-1-2034-5033-0")
                .title("Percy Jakeson")
                .author(author)
                .build();
    }
}
