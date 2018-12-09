package com.iproject.iproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iproject.iproject.model.IslamEvent;

public interface IslamEventRepository extends MongoRepository<IslamEvent, String> {

    public IslamEvent findByName(String name);

}
