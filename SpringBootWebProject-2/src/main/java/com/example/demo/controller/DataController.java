package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("control")
public class DataController {
	
	@PostMapping
	public String displayData(@RequestParam String name,int mark1,int mark2,int mark3,int mark4,int mark5) {
		return name+"'s Percentage : "+((mark1+mark2+mark3+mark4+mark5)/500.0)*100.0;
	}
		
	
	
}
