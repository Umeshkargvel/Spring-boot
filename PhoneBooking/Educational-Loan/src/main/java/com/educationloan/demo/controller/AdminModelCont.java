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

import com.educationloan.demo.entity.AdminModel;

import com.educationloan.demo.service.AdminModelService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class AdminModelCont {
	@Autowired
	 AdminModelService ams;
	
	@Tag(name="Get",description="GET")
	@GetMapping("/GET")
	public List<AdminModel> getAllId(){
		
		return ams.getAllId();
		
	}
	
	@Tag(name="Post",description="POST")
	@PostMapping("/POST")
	public AdminModel saveId(@RequestBody AdminModel a)
	{
		return ams.saveId(a);
	}
	
	@Tag(name="Put",description="PUT")
	@PutMapping("/PUT")
	public AdminModel updateId(@RequestBody AdminModel a)
	{
		return ams.updateId(a);
	}
	
	@Tag(name="delete",description="DELETE")
	@DeleteMapping("DELETE/{id}")
	public void deleteId(@PathVariable int id)
	{
		 ams.deleteId(id);
	}
}
