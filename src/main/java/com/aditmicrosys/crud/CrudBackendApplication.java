package com.aditmicrosys.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditmicrosys.crud.entities.User;
import com.aditmicrosys.crud.repository.UserRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository .save(new User("one", "one"));
		userRepository .save(new User("two", "one"));
		userRepository .save(new User("three", "one"));
		
	}

}
