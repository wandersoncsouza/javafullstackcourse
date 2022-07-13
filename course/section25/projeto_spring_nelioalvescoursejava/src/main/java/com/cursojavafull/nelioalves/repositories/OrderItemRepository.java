package com.cursojavafull.nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavafull.nelioalves.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
