package com.gustavopierre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopierre.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
