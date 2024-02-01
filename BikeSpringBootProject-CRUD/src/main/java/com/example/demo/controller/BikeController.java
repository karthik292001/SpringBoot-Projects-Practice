package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bike;
import com.example.demo.services.BikeService;

@RestController
@RequestMapping("bike")
public class BikeController {
	
	BikeService bikesrv;
	

	public BikeController(BikeService bikesrv) {
		super();
		this.bikesrv = bikesrv;
	}

	@PostMapping
	public String addBike(@RequestBody Bike bike) {
		String msg=bikesrv.addBike(bike);
		return msg;
	}

	@GetMapping(value="{regNO}")
	public Bike getBike(@PathVariable String regNO) {
		Bike bike = bikesrv.getBike(regNO);
		return bike;
	}
	
	@GetMapping
	public List<Bike> getAllBike() {
		List<Bike> bikeList= bikesrv.getAllBike();
		return bikeList;
	}
	
	@PutMapping
	public String updateBike(@RequestBody Bike bike) {
		String msg=bikesrv.updateBike(bike);
		return msg;
	}
	
	@DeleteMapping(value="{regNO}")
	public String deleteBike(@PathVariable String regNO) {
		String msg=bikesrv.deleteBike(regNO);
		return msg;
	}
}
