package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Bike;

public interface BikeService {
	
	String addBike(Bike bike);
	Bike getBike(String regNO);
	List<Bike> getAllBike();
	String updateBike(Bike bike);
	String deleteBike(String regNO);

}
