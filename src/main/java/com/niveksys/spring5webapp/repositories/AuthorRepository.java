package com.niveksys.spring5webapp.repositories;

import com.niveksys.spring5webapp.model.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
