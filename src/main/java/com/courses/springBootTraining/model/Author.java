package com.courses.springBootTraining.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Getter
@Setter
@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private Set<Book> booksSet;

    public Author(String firstName, String lastName, Set<Book> booksSet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksSet = booksSet;
    }

    public Author()
    {

    }


}
