package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;

@RestController
@RequestMapping("stud")
public class StudentController {
	
	
	@GetMapping("{kodID}")
	public Student getStudentInfo(@PathVariable String kodID) {
		
		Student st=new Student(kodID,"karthik",23);
		return st;
	}
	

}
