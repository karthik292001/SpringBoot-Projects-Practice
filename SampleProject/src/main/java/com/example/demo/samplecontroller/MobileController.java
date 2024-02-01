package com.example.demo.samplecontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sampleentities.Mobile;

@RestController
@RequestMapping("mobile")
public class MobileController {
	
	Mobile mob;
	
	@PostMapping
	public String createMobile(@RequestBody Mobile mob) {
		this.mob=mob;
		return "Mobile object created";
	}
	
	@GetMapping("{srNO}")
	public Mobile fetchMobile(@PathVariable String srNO) {
		if(mob==null) {
			System.out.println("Mobile object is not created");
		}else {
			System.out.println("Mobile object is fetched");
		}
		return mob;
	}
	
	@PutMapping
	public String updateMobile(@RequestBody Mobile mob) {
		this.mob=mob;
		return "Mobile object updated successfully";
	}
	
	@DeleteMapping("{srNO}")
	public String deleteMobile(@PathVariable String srNO) {
		this.mob=null;
		return "Mobile object deleted successfully";
	}
	
	

}
