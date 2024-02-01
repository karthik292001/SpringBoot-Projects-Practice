package com.example.demo.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee,String>{

}
