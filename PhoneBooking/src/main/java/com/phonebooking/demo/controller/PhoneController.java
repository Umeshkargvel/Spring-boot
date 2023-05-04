package com.phonebooking.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.phonebooking.demo.model.PhoneDetails;
import com.phonebooking.demo.service.PhoneService;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class PhoneController {
	
	@Autowired
	
	
	PhoneService phoService;
	@Tag(name="Get",description="get data")
	@GetMapping(value="/get")
	public List<PhoneDetails> getAllPhone(){
		
		List<PhoneDetails> phoList = phoService.getAllPhone();
		return phoList;
	}
	
	@Tag(name="Post",description="post data")
	@PostMapping(value="/post")
	public PhoneDetails savePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	@Tag(name="Put",description="put data")
	@PutMapping(value="/put")
	public PhoneDetails updatePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	@Tag(name="Delete",description="delete data")
	@DeleteMapping(value="/delete/{id}")
	public void deletePhone(@PathVariable ("id") int modelId) {
		
		phoService.deletePhone(modelId);
	}
	
	@Tag(name="Get",description="getid data")
	@GetMapping(value="/getid/{id}")
	public PhoneDetails getPhone(@PathVariable ("id") int modelId) {
		
		return phoService.getPhone(modelId);
	}
	
	@Tag(name="Get",description="getfield data")
	@GetMapping(value="/getfield/{field}")
	public List<PhoneDetails> sortPhoneDetails(@PathVariable String field)
	{
		return phoService.sortPhoneDetails(field);
	}
	
	@Tag(name="Get",description="listpage")
	@GetMapping(value="/listpage/{offset}/{pageSize}")
	public List<PhoneDetails> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return phoService.paging(offset,pageSize);
	}
	
	@Tag(name="Get",description="paging data")
	@GetMapping(value="/paging/{offset}/{pageSize}")
	public Page<PhoneDetails> pagingPhoneDetails(@PathVariable int offset,@PathVariable int pageSize)
	{
		return phoService.pagingPhoneDetails(offset,pageSize);
	}
	
	@Tag(name="Get",description="panging and sorting data")
	@GetMapping(value="/pagingandsortingphonedetails/{offset}/{pageSize}/{field}")
	public Page<PhoneDetails> pagingAndSortingPhoneDetails(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return phoService.pagingAndSortingPhoneDetails(offset,pageSize,field);
	}
	
	@Tag(name="Get",description="prefix data")
	@GetMapping("/fetchPhoneDetailsByNamePrefix")
	public List<PhoneDetails> fetchPhoneDetailsByBrandPrefix(@RequestParam String prefix)
	{
		return phoService.fetchPhoneDetailsByBrandPrefix(prefix);	
	}
	
	@Tag(name="Get",description="suffix data")
	@GetMapping("/fetchPhoneDetailsBySuffix")
	public List<PhoneDetails> fetchPhoneDetailsByBrandSuffix(@RequestParam String suffix)
	{
		return phoService.fetchPhoneDetailsByBrandSuffix(suffix);	
	}
	
	@Tag(name="Get",description="getModelNameBrand details")
	@GetMapping("/getModelNameByBrand/{brand}/{modelname}")
	public List<PhoneDetails>getModelNameBrand (@PathVariable String brand,@PathVariable String modelname)
	{
		return phoService.getModelNameBrand(brand,modelname);
	}
	
	@Tag(name="Get",description="getbrand data")
	@GetMapping("/getBrand")
	public List<PhoneDetails>getBrand(@RequestParam String brand)
	{
		return phoService.getBrand(brand);
	}
	
	@Tag(name="Delete",description="deletebrandname data")
	@DeleteMapping("/deleteBrandName")
	public String deleteByBrandname(@RequestParam String brand)
	{
		int result=phoService.deleteByBrandname(brand);
		if(result>0)
		{
			return "Deletion is successfull";
		}
		else
		{
			return "Error occurs";
		}
	}
	
	@Tag(name="Put",description="updatemodelname data")
	@PutMapping("/updateModelName")
	public String updateModelname(@RequestParam String modelname,@RequestParam int modelid)
	{
		int result=phoService.updateByModelname(modelname,modelid);
		if(result>0)
		{
			return "update is successfull";
		}
		else
		{
			return "Error occurs";
		}
	}
	

	
}
