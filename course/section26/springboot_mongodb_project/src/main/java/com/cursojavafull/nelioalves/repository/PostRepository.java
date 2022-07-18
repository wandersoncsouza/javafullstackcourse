package com.cursojavafull.nelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cursojavafull.nelioalves.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
