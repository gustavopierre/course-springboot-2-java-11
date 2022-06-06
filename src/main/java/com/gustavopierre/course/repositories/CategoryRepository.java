package com.gustavopierre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopierre.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
