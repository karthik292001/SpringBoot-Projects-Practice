package com.example.demo.services;

public interface UserService {
	
	String createUser(String email,String password);
	String deleteUser(String email);
	
}
