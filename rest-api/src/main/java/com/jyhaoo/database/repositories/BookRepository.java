package com.jyhaoo.database.repositories;

import com.jyhaoo.database.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository <BookEntity, String> {
}
