package com.courses.springBootTraining.repositories;

import com.courses.springBootTraining.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{
}
