package com.jyhaoo.jdbctemplate.dao.impl;

import com.jyhaoo.jdbctemplate.TestDataUtil;
import com.jyhaoo.jdbctemplate.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl underTest;

    @Test
    public void testThatCreateBookGeneratesCorrectSql() {
        Book book = TestDataUtil.createTestBook();

        underTest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)"),
                eq("818-1-2034-5033-0"),
                eq("Percy Jakeson"),
                eq(1L)
        );
    }

    @Test
    public void testThatFindOneBookGeneratesCorrectSql() {
        underTest.find("818-1-2034-5033-0");
        verify(jdbcTemplate).query(
                eq("SELECT isbn, title, author_id FROM books WHERE isbn = ? LIMIT 1"),
                ArgumentMatchers.<BookDaoImpl.BookRowMapper>any(),
                eq("818-1-2034-5033-0")
        );
    }

    @Test
    public void testThatUpdateGeneratesCorrectSql() {
        Book book = TestDataUtil.createTestBook();
        underTest.update(book.getIsbn(), book);
        verify(jdbcTemplate).update(
                "UPDATE books SET isbn = ?, title = ?, author_id = ? WHERE isbn = ?",
                "818-1-2034-5033-0", "Percy Jakeson", 1L, "818-1-2034-5033-0"
        );
    }

    @Test
    public void testThatDeleteGeneratesCorrectSql() {
        Book book = TestDataUtil.createTestBook();
        underTest.delete(book.getIsbn());
        verify(jdbcTemplate).update(
                "DELETE FROM books WHERE isbn = ?",
                "818-1-2034-5033-0"
        );
    }
}
