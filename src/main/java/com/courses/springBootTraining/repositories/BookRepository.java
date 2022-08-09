package com.courses.springBootTraining.repositories;

import com.courses.springBootTraining.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kamgorny on 09/08/22.
 */


public interface BookRepository extends CrudRepository<Book, Long>
{
}
