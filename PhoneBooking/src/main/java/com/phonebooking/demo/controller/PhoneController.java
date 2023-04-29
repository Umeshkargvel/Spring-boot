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


@RestController
public class PhoneController {
	
	@Autowired
	
	
	PhoneService phoService;
	
	@GetMapping(value="/get")
	public List<PhoneDetails> getAllPhone(){
		
		List<PhoneDetails> phoList = phoService.getAllPhone();
		return phoList;
	}
	
	@PostMapping(value="/post")
	public PhoneDetails savePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	@PutMapping(value="/put")
	public PhoneDetails updatePhone(@RequestBody PhoneDetails p) {
		
		return phoService.savePhone(p);
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public void deletePhone(@PathVariable ("id") int modelId) {
		
		phoService.deletePhone(modelId);
	}
	
	@GetMapping(value="/getid/{id}")
	public PhoneDetails getPhone(@PathVariable ("id") int modelId) {
		
		return phoService.getPhone(modelId);
	}
	
	@GetMapping(value="/getfield/{field}")
	public List<PhoneDetails> sortPhoneDetails(@PathVariable String field)
	{
		return phoService.sortPhoneDetails(field);
	}
	
	@GetMapping(value="/listpage/{offset}/{pageSize}")
	public List<PhoneDetails> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return phoService.paging(offset,pageSize);
	}
	
	@GetMapping(value="/paging/{offset}/{pageSize}")
	public Page<PhoneDetails> pagingPhoneDetails(@PathVariable int offset,@PathVariable int pageSize)
	{
		return phoService.pagingPhoneDetails(offset,pageSize);
	}
	
	
	@GetMapping(value="/pagingandsortingphonedetails/{offset}/{pageSize}/{field}")
	public Page<PhoneDetails> pagingAndSortingPhoneDetails(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return phoService.pagingAndSortingPhoneDetails(offset,pageSize,field);
	}
	
	@GetMapping("/fetchPhoneDetailsByNamePrefix")
	public List<PhoneDetails> fetchPhoneDetailsByBrandPrefix(@RequestParam String prefix)
	{
		return phoService.fetchPhoneDetailsByBrandPrefix(prefix);	
	}
	
	@GetMapping("/fetchPhoneDetailsBySuffix")
	public List<PhoneDetails> fetchPhoneDetailsByBrandSuffix(@RequestParam String suffix)
	{
		return phoService.fetchPhoneDetailsByBrandSuffix(suffix);	
	}
	
	@GetMapping("/fetchPhoneDetailsByBrand")
	public List<PhoneDetails> fetchPhoneDetailsByBrandName(@RequestParam String brand)
	{
		return phoService.fetchPhoneDetailsByBrand(brand);
	}
	
	
	

}
