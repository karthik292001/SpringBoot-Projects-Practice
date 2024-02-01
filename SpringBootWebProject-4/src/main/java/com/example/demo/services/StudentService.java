package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentService {
	
	String createStudent(Student s);
	List<Student> fetchStudent();
	String updateStudent(Student s);
	String deleteStudent(String roll);

}
