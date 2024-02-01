package com.example.demo.entities;

public class Laptop {
	
	String srNO;
	String brand;
	double cost;
	
	public Laptop() {
		super();
	}
	public Laptop(String srNO, String brand, double cost) {
		super();
		this.srNO = srNO;
		this.brand = brand;
		this.cost = cost;
	}
	public String getSrNO() {
		return srNO;
	}
	public void setSrNO(String srNO) {
		this.srNO = srNO;
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
		return "Laptop [srNO=" + srNO + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
