package com.niveksys.poc.springbootwebapp.repository;

import com.niveksys.poc.springbootwebapp.model.Publisher;

import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
