package com.courses.springBootTraining.repository;

import com.courses.springBootTraining.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{
}
