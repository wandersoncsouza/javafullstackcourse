package com.cursojavafull.nelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cursojavafull.nelioalves.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
