package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmpService;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	
	EmpService empserv;
	
	
	public EmployeeController(EmpService empserv) {
		super();
		this.empserv = empserv;
	}

	@PostMapping
	public String addEmp(@RequestBody Employee e) {
		String msg=empserv.addEmp(e);
		return msg;
	}
	
	@GetMapping(value="{empID}")
	public Employee getEmp(@PathVariable String empID) {
		Employee e=empserv.getEmp(empID);
		return e;
	}
	
	@GetMapping
	public List<Employee> getAllEmp(){
		List<Employee> empList=empserv.getAllEmp();
		return empList;
	}
	
	@PutMapping
	public String updateEmp(@RequestBody Employee e) {
		String msg=empserv.updateEmp(e);
		return msg;
	}
	
	@DeleteMapping(value="{empID}")
	public String deleteEmp(@PathVariable String empID) {
		String msg=empserv.deleteEmp(empID);
		return msg;
	}

}
