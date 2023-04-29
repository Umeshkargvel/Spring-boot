package com.phonebooking.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebooking.demo.dao.UserRepository;
import com.phonebooking.demo.model.UserDetails;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	
	
	public String validateUser(String email,String password)
	{
		String result="";
		UserDetails u = ur.findByEmail(email);
		if(u==null)
		{
			result="Invalid user";
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login Success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
		
	}
	
	public UserDetails saveUserDetails(UserDetails u)
	{
		return ur.save(u);
	}
	
	
	public List<UserDetails> getAllUserDetails() {
			List<UserDetails> userList=ur.findAll();
		return userList;
	}

}
