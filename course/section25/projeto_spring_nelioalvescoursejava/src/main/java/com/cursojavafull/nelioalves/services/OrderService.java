package com.cursojavafull.nelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojavafull.nelioalves.entities.Order;
import com.cursojavafull.nelioalves.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired // injeçao de dependencia do Spring
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
