package com.courses.springBootTraining.model;

import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.*;

/**
 * Created by kamgorny on 09/08/22.
 */


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


    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authorsSet = new HashSet<>();

    /**
     * The constructor.
     * @param title the book title.
     * @param isbn the ISBN code.
     * @param authorsSet the set with authors of the book.
     */
    public Book(String title, String isbn, Set<Author> authorsSet)
    {
        this.title = title;
        this.isbn = isbn;
        this.authorsSet = authorsSet;
    }

    public Book()
    {
    }

    @Override
    public String toString()
    {
        String sb = "Book{" + "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
        return sb;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
