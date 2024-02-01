package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.UserService;

@Controller
@RequestMapping("control")
public class UsersController {
	
	UserService userSrv;
	
	public UsersController(UserService userSrv) {
		super();
		this.userSrv = userSrv;
	}
	
	@GetMapping("delete-page")
	public String deletePage() {
		return "delete";
	}
	
	


	@PostMapping("create")
	public String createUser(@RequestParam String email,String password) {
		userSrv.createUser(email,password);
		return "homePage";
	}
	
	@GetMapping("delete")
	public String deleteUser(@RequestParam String email) {
		userSrv.deleteUser(email);
		return "deleteusersuccess";
	}
	
	
	
}
