package com.courses.springBootTraining.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.Objects;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authorsSet;

    public Book(String title, String isbn)
    {
        this.title = title;
        this.isbn = isbn;
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
                ", authorsSet=" + authorsSet +
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
