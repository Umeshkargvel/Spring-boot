package com.educationloan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationloan.demo.entity.AdminModel;

import com.educationloan.demo.repository.AdminModelRepo;

@Service
public class AdminModelService {
	@Autowired
	
	AdminModelRepo amr;
	
	public List<AdminModel> getAllId() {
		return amr.findAll();
	}
	
	public AdminModel saveId(AdminModel a) {
		return amr.save(a);
	}

	public AdminModel updateId(AdminModel a) {
		
		return amr.save(a);
	}

	public void deleteId(int id) {
	
		 amr.deleteById(id);
	}
	

}
