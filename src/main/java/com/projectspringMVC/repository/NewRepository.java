package com.projectspringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringMVC.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
