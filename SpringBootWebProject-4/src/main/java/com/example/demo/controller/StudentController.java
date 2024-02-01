package com.example.demo.controller;

import java.util.List;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@Controller
@RequestMapping("control")
public class StudentController {
	
    StudentService stdsrv;


	public StudentController(StudentService stdsrv) {
		super();
		this.stdsrv = stdsrv;
	}

	
	
	@GetMapping("create-page")
	public String addPage() {
		return "createstudent";	
	}
	
	@GetMapping("update-page")
	public String updatePage() {
		return "updatestudent";
	}
	
	@GetMapping("delete-page")
	public String deletePage() {
		return "deletestudent";
	}
	


	@PostMapping("create")
	public String createStudent(@ModelAttribute Student s) {
		stdsrv.createStudent(s);
		return "createstudentsuccess";
	}
	
	@GetMapping("fetch")
	public String fecthStudent(Model model) {
		
		//Fetching student data through service
		List<Student> liststud=stdsrv.fetchStudent();
		
		//Adding fetched data in model
		model.addAttribute("students", liststud);
		
		//Returning control to viewstudent.html
		return "viewstudent";
	}
	
	
	
	@PostMapping("update")
	public String updateStudent(@ModelAttribute Student s) {
		stdsrv.updateStudent(s);
		return "updatestudentsuccess";
	}
	
	@GetMapping("delete")
	public String deleteStudent(@RequestParam String roll) {
		stdsrv.deleteStudent(roll);
		return "deletestudentsuccess";
	}
	
}
