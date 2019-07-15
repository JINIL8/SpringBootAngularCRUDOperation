package com.aditmicrosys.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditmicrosys.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		
}
