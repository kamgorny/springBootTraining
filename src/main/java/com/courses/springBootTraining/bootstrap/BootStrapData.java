package com.courses.springBootTraining.bootstrap;


import com.courses.springBootTraining.model.Author;
import com.courses.springBootTraining.model.Book;
import com.courses.springBootTraining.model.Publisher;
import com.courses.springBootTraining.repositories.AuthorRepository;
import com.courses.springBootTraining.repositories.BookRepository;
import com.courses.springBootTraining.repositories.PublisherRepository;
import java.util.HashSet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by kamgorny on 09/08/22.
 */
@Component
public class BootStrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Author author1 = new Author("John", "Doe", new HashSet<>());
        Book book1 = new Book("Test Book", "123321", new HashSet<>());
        author1.getBooksSet().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Adam", "Smith", new HashSet<>());
        Book book2 = new Book("Test Book 2", "142523", new HashSet<>());
        author2.getBooksSet().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);

        Publisher publisher1 = new Publisher("Test Publisher", "Test address 123");
        publisherRepository.save(publisher1);

        System.out.println("Started in Bootstrap.");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());

    }
}
