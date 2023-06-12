package com.phonebooking.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebooking.demo.dao.SignupRepository;

import com.phonebooking.demo.model.Signup;

@Service
public class SignupService {
	@Autowired
	
	SignupRepository signupRepo;
	
	public List<Signup> getAllPhone(){
		List<Signup> signupList = signupRepo.findAll();
		return signupList;
	}
	
	public Signup savePhone(Signup s)
	{
		return signupRepo.save(s);
	}
	
	public void deletePhone(int id)
	{
		
		signupRepo.deleteById(id);
	}



}
