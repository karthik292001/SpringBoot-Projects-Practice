package com.example.demo.sampleentities;

public class Employee {

	String emp_ID;
	String name;
	double salary;
	public Employee() {
		super();
	}
	public Employee(String emp_ID, String name, double salary) {
		super();
		this.emp_ID = emp_ID;
		this.name = name;
		this.salary = salary;
	}
	public String getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(String emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", name=" + name + ", salary=" + salary + "]";
	}

}
