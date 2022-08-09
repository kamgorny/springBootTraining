package com.courses.springBootTraining.repository;

import com.courses.springBootTraining.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
