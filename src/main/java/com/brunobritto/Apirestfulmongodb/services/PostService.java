package com.brunobritto.Apirestfulmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunobritto.Apirestfulmongodb.domain.Post;
import com.brunobritto.Apirestfulmongodb.repository.PostRepository;
import com.brunobritto.Apirestfulmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	
	}
}
