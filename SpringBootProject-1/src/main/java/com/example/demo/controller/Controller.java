package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("table")
public class Controller {
	
	@GetMapping("create")
	public String create() {
		return "Data inserted successfully";
	}
	
	@GetMapping("read")
	public String read() {
		return "Data fetched successfully";
	}
	
	@GetMapping("update")
	public String update() {
		return "Existing data updated successfully";
	}
	
	@GetMapping("delete")
	public String delete() {
		return "Existing data deleted successfully";
	}
	
	

}
