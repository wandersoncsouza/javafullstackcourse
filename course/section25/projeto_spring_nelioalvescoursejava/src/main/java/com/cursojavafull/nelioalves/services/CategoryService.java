package com.cursojavafull.nelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojavafull.nelioalves.entities.Category;
import com.cursojavafull.nelioalves.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired	// injeçao de dependencia do Spring
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
