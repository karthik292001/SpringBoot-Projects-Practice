package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>{

}
