package com.cursojavafull.nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavafull.nelioalves.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
