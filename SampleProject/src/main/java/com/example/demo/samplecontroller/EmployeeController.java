package com.example.demo.samplecontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sampleentities.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	Employee emp;
	
	@PostMapping
	public String createEmployee(@RequestBody Employee emp) {
		this.emp=emp;
		return "Employee is created";
	}
	
	@GetMapping("{emp_ID}")
	public Employee fetchEmployee(@PathVariable String emp_ID) {
		if(emp==null) {
			System.out.println("Employee object is not created");
		}else {
			System.out.println("Employee object fetched successfully");
		}
		return emp;
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {
		this.emp=emp;
		return "Employee is updated";
	}
	
	@DeleteMapping("{emp_ID}")
	public String deleteEmployee(@PathVariable String emp_ID) {
		this.emp=null;
		return "Employee is deleted";
	}
}
