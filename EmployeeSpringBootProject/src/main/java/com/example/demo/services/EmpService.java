package com.example.demo.services;

import java.util.List;


import com.example.demo.entities.Employee;

public interface EmpService {

	String addEmp(Employee e);
	Employee getEmp(String empID);
	List<Employee> getAllEmp();
	String updateEmp(Employee e);
	String deleteEmp(String empID);
	
	
}
