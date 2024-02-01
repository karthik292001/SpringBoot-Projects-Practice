package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Users;
import com.example.demo.services.UserService;

@Controller
public class UsersController {
	
	@Autowired
	UserService userv;
	
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) {
		boolean isUserExist=userv.isEmailExists(user.getEmail());
		if(isUserExist) {
			return "registerfail";
		}else {
			userv.addUser(user);
			return "registersuccess";
		}
	}
	
	@PostMapping("/login")
	public String validateUser(@RequestParam String email,@RequestParam String password) {
		boolean loginStatus=userv.validateUser(email, password);
		
		if(loginStatus) {
			String userRole=userv.getUserRole(email);
			if(userRole.equalsIgnoreCase("admin")) {
				return "adminhomepage";
			}else {
				return "userhomepage";
			}
		}else {
			return "loginfail";
		}
	}
	
}
