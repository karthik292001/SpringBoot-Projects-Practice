package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.services.repositories.EmpRepository;

@Service
public class EmpServiceImplementation implements EmpService {

	EmpRepository empRepo;
	


	public EmpServiceImplementation(EmpRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public String addEmp(Employee e) {
		
		empRepo.save(e);
		return "Employee object created";
	}

	@Override
	public Employee getEmp(String empID) {
		Employee e=empRepo.findById(empID).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> empList=empRepo.findAll();
		return empList;
	}

	@Override
	public String updateEmp(Employee e) {
		empRepo.save(e);
		return "Employee object is updated";
	}

	@Override
	public String deleteEmp(String empID) {
		empRepo.deleteById(empID);
		return "Employee object is deleted";
	}

	
}
