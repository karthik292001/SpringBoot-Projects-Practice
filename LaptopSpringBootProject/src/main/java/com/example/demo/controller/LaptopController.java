package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController {
		
	Laptop lap;
	
	@PostMapping
	public String create(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Laptop object created successfully";
	}
	
	@GetMapping("{srNO}")
	public Laptop read(@PathVariable String srNO) {
		if(srNO.equals(lap.getSrNO())) {
			return lap;
		}else {
			System.out.println("*****Laptop object is not created!*****");
		}
		return null;
	}
	
	@PutMapping
	public String update(@RequestBody Laptop newlap) {
		this.lap=newlap;
		return "Laptop object updated successfully";
	}
	
	@DeleteMapping
	public String delete() {
		this.lap=null;
		return "Laptop object removed successfully";
	}
	

}
