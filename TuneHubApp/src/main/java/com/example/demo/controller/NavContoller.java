package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavContoller {
	

	@GetMapping("/map-registerpage")
	public String registerPage() {
		return "register";
	}
	
	@GetMapping("/map-loginPage")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/map-addsongs")
	public String addSongs() {
		return "addsongs";
	}
}
