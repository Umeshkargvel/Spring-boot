package com.educationloan.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.educationloan.demo.entity.LoanApplicationModel;
import com.educationloan.demo.service.LoanApplicationModelService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LoanApplicationModelCont {
	
	@Autowired
	
	LoanApplicationModelService lams;

	@Tag(name="Get",description="Getid")
	@GetMapping("/GETid")
	public List<LoanApplicationModel> getAllId(){
		
		return lams.getAllId();
		
	}
	
	@Tag(name="Post",description="POSTid")
	@PostMapping("/POSTid")
	public LoanApplicationModel saveId(@RequestBody LoanApplicationModel z)
	{
		return lams.saveId(z);
	}
	
	@Tag(name="Put",description="PUTid")
	@PutMapping("/PUTid")
	public LoanApplicationModel updateId(@RequestBody LoanApplicationModel z)
	{
		return lams.updateId(z);
	}
	
	@Tag(name="delete",description="DELETEid")
	@DeleteMapping("/DELETEid/{id}")
	public void deleteId(@PathVariable int id)
	{
		 lams.deleteId(id);
	}
	
}
