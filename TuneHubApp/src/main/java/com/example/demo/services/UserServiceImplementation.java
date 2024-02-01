package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UsersRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UsersRepository userRepo;
	
	@Override
	public String addUser(Users user) {
			userRepo.save(user);
			return "homepage";
	}
	

	@Override
	public boolean isEmailExists(String email) {
		Users user=userRepo.findByEmail(email);
		if(user!=null) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean validateUser(String email, String password) {
		Users user =userRepo.findByEmail(email);
		if(user!=null) {
			String db_password = user.getPassword();
			if(db_password.equals(password)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}


	@Override
	public String getUserRole(String email) {
		Users user=userRepo.findByEmail(email);
		return user.getRole();
	}

	
}
