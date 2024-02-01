package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	StudentRepository stdRepo;
	
	public StudentServiceImplementation(StudentRepository stdRepo) {
		super();
		this.stdRepo = stdRepo;
	}

	@Override
	public String createStudent(Student s) {
		stdRepo.save(s);
		return "createstudentsuccess";
	}

	
	@Override
	public List<Student> fetchStudent() {
		List<Student>  liststud =stdRepo.findAll();
		return liststud;
	}

	@Override
	public String updateStudent(Student s) {
		stdRepo.save(s);
		return "createstudentsuccess";
	}

	@Override
	public String deleteStudent(String roll) {
		stdRepo.deleteById(roll);
		return "deletestudentsuccess";
	}
	
	

	
	
}
