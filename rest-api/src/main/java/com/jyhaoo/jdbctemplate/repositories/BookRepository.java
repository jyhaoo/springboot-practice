package com.jyhaoo.jdbctemplate.repositories;

import com.jyhaoo.jdbctemplate.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository <Book, String> {
}
