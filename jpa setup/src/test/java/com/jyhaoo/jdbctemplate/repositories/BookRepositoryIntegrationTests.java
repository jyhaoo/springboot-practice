package com.jyhaoo.jdbctemplate.repositories;

import com.jyhaoo.jdbctemplate.TestDataUtil;
import com.jyhaoo.jdbctemplate.domain.Author;
import com.jyhaoo.jdbctemplate.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookRepositoryIntegrationTests {

    private BookRepository underTest;

    @Autowired
    public BookRepositoryIntegrationTests(BookRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testThatBookCanBeCreatedAndRecalled() {
        Author author = TestDataUtil.createTestAuthor();
        Book book = TestDataUtil.createTestBook(author);
        underTest.save(book);

        Optional<Book> result = underTest.findById(book.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(book);
    }
//
//    @Test
//    public void testThatBookCanBeUpdated() {
//        Author author = TestDataUtil.createTestAuthor();
//        authorDao.create(author);
//
//        Book book = TestDataUtil.createTestBook();
//        book.setAuthorId(author.getId());
//        underTest.create(book);
//
//        book.setTitle("Percy Patterson");
//        underTest.update(book.getIsbn(), book);
//        Optional<Book> result = underTest.find(book.getIsbn());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(book);
//    }
//
//    @Test
//    public void testThatBookCanBeDeleted() {
//        Author author = TestDataUtil.createTestAuthor();
//        authorDao.create(author);
//
//        Book book = TestDataUtil.createTestBook();
//        book.setAuthorId(author.getId());
//        underTest.create(book);
//
//        underTest.delete(book.getIsbn());
//        Optional<Book> result = underTest.find(book.getIsbn());
//        assertThat(result).isEmpty();
//    }
}
