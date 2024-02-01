package com.example.demo.entities;

public class Student {

	String kodID;
	String name;
	int age;
	
	public Student() {
		super();
	}
	public Student(String kodID, String name, int age) {
		super();
		this.kodID = kodID;
		this.name = name;
		this.age = age;
	}
	public String getKodID() {
		return kodID;
	}
	public void setKodID(String kodID) {
		this.kodID = kodID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [kodID=" + kodID + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
