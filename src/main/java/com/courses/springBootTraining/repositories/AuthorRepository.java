package com.courses.springBootTraining.repositories;

import com.courses.springBootTraining.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kamgorny on 09/08/22.
 */


public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
