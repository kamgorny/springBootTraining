package com.courses.springBootTraining.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String isbn;

    public Book(String title, String isbn)
    {
        this.title = title;
        this.isbn = isbn;
    }

    public Book()
    {
    }
}
