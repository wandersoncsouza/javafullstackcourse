package com.cursojavafull.nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavafull.nelioalves.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
