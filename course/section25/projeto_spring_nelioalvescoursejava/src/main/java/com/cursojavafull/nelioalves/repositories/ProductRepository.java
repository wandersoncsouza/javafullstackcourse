package com.cursojavafull.nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavafull.nelioalves.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
