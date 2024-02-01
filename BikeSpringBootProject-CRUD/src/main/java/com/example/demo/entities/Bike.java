package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	
	@Id
	String regNO;
	String brand;
	double cost;
	
	public Bike() {
		super();
	}
	public Bike(String regNO, String brand, double cost) {
		super();
		this.regNO = regNO;
		this.brand = brand;
		this.cost = cost;
	}
	public String getRegNO() {
		return regNO;
	}
	public void setRegNO(String regNO) {
		this.regNO = regNO;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNO=" + regNO + ", brand=" + brand + ", cost=" + cost + "]";
	}

	
}
