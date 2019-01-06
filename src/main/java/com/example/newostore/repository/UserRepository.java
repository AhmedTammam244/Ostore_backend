package com.example.newostore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.newostore.model.User;

@CrossOrigin(origins = "http://localhost:4200")

public interface UserRepository extends JpaRepository<User, Long> {
	// @Query(value="Select o from User ") List<User> updateOrder;
	
}

