package com.educationloan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.educationloan.demo.entity.LoanApplicationModel;
import com.educationloan.demo.repository.LoanApplicationModelRepo;

@Service
public class LoanApplicationModelService {
	@Autowired
	
	LoanApplicationModelRepo lamr;

	public List<LoanApplicationModel> getAllId() {
		return lamr.findAll();
	}
	
	public LoanApplicationModel saveId(LoanApplicationModel a) {
		return lamr.save(a);
	}

	public LoanApplicationModel updateId(LoanApplicationModel a) {
		
		return lamr.save(a);
	}

	public void deleteId(int id) {
	
		 lamr.deleteById(id);
	}
	
}
