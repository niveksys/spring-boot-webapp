package com.niveksys.poc.springbootwebapp.repository;

import com.niveksys.poc.springbootwebapp.model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
