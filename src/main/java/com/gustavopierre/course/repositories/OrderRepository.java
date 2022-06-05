package com.gustavopierre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopierre.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
