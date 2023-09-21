package com.brunobritto.Apirestfulmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunobritto.Apirestfulmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}

