package com.projectspringMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringMVC.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUserNameAndStatus(String name, int status);
}
