package com.cursojavafull.nelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojavafull.nelioalves.entities.Product;
import com.cursojavafull.nelioalves.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired	// injeçao de dependencia do Spring
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
