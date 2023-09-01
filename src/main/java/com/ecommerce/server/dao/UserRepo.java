package com.ecommerce.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.server.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByPhoneNumber(String phoneNumber);
	public User findByPhoneNumberAndPassword(String phoneNumber, String password);
	public User findByPhoneNumberAndEmailId(String phoneNumber, String email);
	
}
