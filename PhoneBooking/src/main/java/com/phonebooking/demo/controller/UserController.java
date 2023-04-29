package com.phonebooking.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phonebooking.demo.model.UserDetails;
import com.phonebooking.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping(value="/getuserdetails")
	public List<UserDetails> getAllUserDetails()
	{
		List<UserDetails> userList=us.getAllUserDetails();
		return userList;
	}
	
	
@PostMapping("/checkLogin")
	
	public String validateUser(@RequestBody UserDetails u) {
		System.out.println(u.getEmail());
		return us.validateUser(u.getEmail(),u.getPassword());
		
	}
	
	@PostMapping("/addUser")
	public UserDetails User(@RequestBody UserDetails u)
	{
			return us.saveUserDetails(u);
	}

}
