package com.cursojavafull.nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavafull.nelioalves.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
