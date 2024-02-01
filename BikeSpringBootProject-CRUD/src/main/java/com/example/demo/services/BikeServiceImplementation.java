package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Bike;
import com.example.demo.repositories.BikeRepository;

@Service
public class BikeServiceImplementation implements BikeService{
	
	
	BikeRepository bikeRepo;
	
	
	public BikeServiceImplementation(BikeRepository bikeRepo) {
		super();
		this.bikeRepo = bikeRepo;
	}
	
	

	@Override
	public String addBike(Bike bike) {
		
		bikeRepo.save(bike);
		return "Bike object is created";
	}

	@Override
	public Bike getBike(String regNO) {
		Bike bike=bikeRepo.findById(regNO).get();
		return bike;
	}

	@Override
	public List<Bike> getAllBike() {
		List<Bike> bikeList =bikeRepo.findAll();
		return bikeList;
	}

	@Override
	public String updateBike(Bike bike) {
		bikeRepo.save(bike);
		return "Bike object is updated";
	}

	@Override
	public String deleteBike(String regNO) {
		bikeRepo.deleteById(regNO);
		return "Bike object is deleted";
	}
	
	

}
