package com.gustavopierre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopierre.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
