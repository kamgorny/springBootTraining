package com.courses.springBootTraining.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.*;

/**
 * Created by kamgorny on 09/08/22.
 */

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

    @ManyToMany(mappedBy = "authorsSet")
    private Set<Book> booksSet = new HashSet<>();

    /**
     * The constructor.
     * @param firstName author's first name.
     * @param lastName  author's last name.
     * @param booksSet  a set with the books written by the author.
     */
    public Author(String firstName, String lastName, Set<Book> booksSet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksSet = booksSet;
    }

    public Author()
    {

    }

    @Override
    public String toString()
    {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
