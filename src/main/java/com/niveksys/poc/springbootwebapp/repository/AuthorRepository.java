package com.niveksys.poc.springbootwebapp.repository;

import com.niveksys.poc.springbootwebapp.model.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
