package com.jyhaoo.jdbctemplate.repositories;

import com.jyhaoo.jdbctemplate.TestDataUtil;
import com.jyhaoo.jdbctemplate.domain.Author;
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
public class AuthorRepositoryIntegrationTests {

    private AuthorRepository underTest;

    @Autowired
    public AuthorRepositoryIntegrationTests (AuthorRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testThatAuthorCanBeCreatedAndRecalled() {
        Author author = TestDataUtil.createTestAuthor();
        underTest.save(author);

        Optional<Author> result = underTest.findById(author.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(author);
    }
//
//    @Test
//    public void testThatAuthorCanBeUpdated() {
//        Author author = TestDataUtil.createTestAuthor();
//        underTest.create(author);
//
//        author.setName("UPDATED");
//        underTest.update(author.getId(), author);
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//    }
//
//    @Test
//    public void testThatAuthorCanBeDeleted() {
//        Author author = TestDataUtil.createTestAuthor();
//        underTest.create(author);
//
//        underTest.delete(author.getId());
//        Optional<Author> result = underTest.findOne(author.getId());
//        assertThat(result).isEmpty();
//    }
}
