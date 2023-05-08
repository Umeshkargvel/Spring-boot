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

import com.educationloan.demo.entity.UserModel;
import com.educationloan.demo.service.UserModelService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class UserModelCont {
	@Autowired
	UserModelService ums;
	
	@Tag(name="Get",description="GetIds")
	@GetMapping("/GetIds")
	public List<UserModel> getAllId(){
		
		return ums.getAllId();
		
	}
	
	@Tag(name="Post",description="Postid")
	@PostMapping("/PostId")
	public UserModel saveId(@RequestBody UserModel u)
	{
		return ums.saveId(u);
	}
	
	@Tag(name="Put",description="Putid")
	@PutMapping("/PutId")
	public UserModel updateId(@RequestBody UserModel u)
	{
		return ums.updateId(u);
	}
	
	@Tag(name="delete",description="deleteid")
	@DeleteMapping("deleteid/{id}")
	public void deleteId(@PathVariable int id)
	{
		 ums.deleteId(id);
	}
}
