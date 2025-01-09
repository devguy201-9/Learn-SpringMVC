package com.projectspringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringMVC.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
