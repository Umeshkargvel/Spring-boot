package com.phonebooking.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonebooking.demo.model.PhoneDetails;
import com.phonebooking.demo.service.PhoneService;

@RestController
public class PhoneController {
	
	@Autowired
	
	
	PhoneService phoService;
	
	@GetMapping(value="/get")
	public List<PhoneDetails> getAllPhones(){
		
		List<PhoneDetails> phoList = phoService.getAllPhone();
		return phoList;
	}
	
	@PostMapping(value="/post")
	public PhoneDetails savePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	@PutMapping(value="/put")
	public PhoneDetails updatePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	
	
	@DeleteMapping(value="/delete/{id}")
	public void deletePhone(@PathVariable ("id") int modelId) {
		
		phoService.deletePhone(modelId);
	}
	
	@GetMapping(value="/getid/{id}")
	public PhoneDetails getPhone(@PathVariable ("id") int modelId) {
		
		return phoService.getPhone(modelId);
	}

}
