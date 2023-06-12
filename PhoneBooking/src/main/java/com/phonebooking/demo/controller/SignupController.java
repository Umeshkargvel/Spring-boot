package com.phonebooking.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonebooking.demo.model.Signup;
import com.phonebooking.demo.service.SignupService;

@RestController
@CrossOrigin("*")
public class SignupController {
	@Autowired
	SignupService signupSer;
	
	@GetMapping("/suget")
	public List<Signup> getAllPhone(){
		List<Signup> signupList = signupSer.getAllPhone();
		return signupList;
	}
	
	@PostMapping("/supost")
	public Signup savePhone(@RequestBody Signup p)
	{
		return signupSer.savePhone(p);
	}
	
	@DeleteMapping("/sudelete/{id}")
	public void deletePhone(@PathVariable ("id") int id)
	{
		signupSer.deletePhone(id);
	}

}
