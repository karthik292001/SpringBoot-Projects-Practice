package com.example.demo.sampleentities;

public class Mobile {

	String srNO;
	String brand;
	String processor;
	double cost;
	public Mobile() {
		super();
	}
	public Mobile(String srNO, String brand, String processor, double cost) {
		super();
		this.srNO = srNO;
		this.brand = brand;
		this.processor = processor;
		this.cost = cost;
	}
	public String getsrNO() {
		return srNO;
	}
	public void setsrNO(String srNO) {
		this.srNO = srNO;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [srNO=" + srNO + ", brand=" + brand + ", processor=" + processor + ", cost=" + cost + "]";
	}
	
}
