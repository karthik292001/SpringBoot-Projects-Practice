package com.example.demo.services;

import com.example.demo.entities.Users;

public interface UserService {
	
	String addUser(Users user);
	boolean isEmailExists(String email);
	boolean validateUser(String email,String password);
	String getUserRole(String email);

}
