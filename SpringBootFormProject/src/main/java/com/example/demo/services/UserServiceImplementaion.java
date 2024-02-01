package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repositories.Repositories;

@Service
public class UserServiceImplementaion implements UserService{

	Repositories userRepo;
	
	
	
	public UserServiceImplementaion(Repositories userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public String createUser(String email,String password) {
		Users user=new Users(email,password);
		userRepo.save(user);
		return "homePage";
	}

	@Override
	public String deleteUser(String email) {
		userRepo.deleteById(email);
		return "deleteusersuccess";
	}
	
	
	

}
