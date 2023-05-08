package com.educationloan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationloan.demo.entity.UserModel;
import com.educationloan.demo.repository.UserModelRepo;


@Service
public class UserModelService {
	@Autowired
	
	UserModelRepo umr;

	public List<UserModel> getAllId() {
		return umr.findAll();
	}
	
	public UserModel saveId(UserModel u) {
		return umr.save(u);
	}

	public UserModel updateId(UserModel u) {
		
		return umr.save(u);
	}

	public void deleteId(int id) {
	
		 umr.deleteById(id);
	}
	

}
