package com.brunobritto.Apirestfulmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunobritto.Apirestfulmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}

