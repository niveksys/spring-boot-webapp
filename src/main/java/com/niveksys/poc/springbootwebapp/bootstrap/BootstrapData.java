package com.niveksys.poc.springbootwebapp.bootstrap;

import com.niveksys.poc.springbootwebapp.model.Author;
import com.niveksys.poc.springbootwebapp.model.Book;
import com.niveksys.poc.springbootwebapp.model.Publisher;
import com.niveksys.poc.springbootwebapp.repository.AuthorRepository;
import com.niveksys.poc.springbootwebapp.repository.BookRepository;
import com.niveksys.poc.springbootwebapp.repository.PublisherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher goodreads = new Publisher();
        goodreads.setName("Goodreads");
        goodreads.setAddressLine1("Kowloon");
        goodreads.setCity("Hong Kong");
        goodreads.setState("HK");
        goodreads.setZip("00000");

        this.publisherRepository.save(goodreads);

        System.out.println("Nubmer of Publishers: " + this.publisherRepository.count());

        Author kevin = new Author("Kevin", "Tsang");
        Book spring = new Book("Spring Boot", "123123");
        kevin.getBooks().add(spring);
        spring.getAuthors().add(kevin);
        this.authorRepository.save(kevin);
        this.bookRepository.save(spring);

        Author joyce = new Author("Joyce", "Lau");
        Book cookbook = new Book("Cookbook", "987987");
        joyce.getBooks().add(cookbook);
        cookbook.getAuthors().add(joyce);
        this.authorRepository.save(joyce);
        this.bookRepository.save(cookbook);

        System.out.println("Nubmer of Books: " + this.authorRepository.count());
    }

}
