package com.phonebooking.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.phonebooking.demo.dao.PhoneRepository;
import com.phonebooking.demo.model.PhoneDetails;

@Service
public class PhoneService {
	@Autowired
	
	PhoneRepository phoRepository;
	public List<PhoneDetails> getAllPhone(){
		
		List<PhoneDetails>phoList = phoRepository.findAll();
		return phoList;
	}
	
	public PhoneDetails savePhone(PhoneDetails p)
	{
		return phoRepository.save(p);
	}

	public PhoneDetails updatePhone(PhoneDetails p)
	{
		return phoRepository.save(p);
	}
	
	public void deletePhone(int modelId)
	{
		
		phoRepository.deleteById(modelId);
	}
	
	public PhoneDetails getPhone(int modelId)
	{
		return phoRepository.findById(modelId).get();
	}
	
	public List<PhoneDetails> sortPhoneDetails(String field)
	{
		return phoRepository.findAll(Sort.by(field));
	}
	
	
	public List<PhoneDetails> paging(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<PhoneDetails> phoData= phoRepository.findAll(paging);
		List<PhoneDetails> phoList= phoData.getContent();
		return phoList;
	}
	
	public Page<PhoneDetails> pagingPhoneDetails(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<PhoneDetails> phoData= phoRepository.findAll(paging);
		//List<PhoneDetails> phoList= phoData.getContent();
		return phoData;
	}
	
	public Page<PhoneDetails> pagingAndSortingPhoneDetails(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<PhoneDetails> pho= phoRepository.findAll(paging);
		return pho;
	}
	
	
	public List<PhoneDetails> fetchPhoneDetailsByBrandPrefix(String prefix)
	{
		return phoRepository.findByBrandStartingWith(prefix);	
	}
	
	public List<PhoneDetails> fetchPhoneDetailsByBrandSuffix(String suffix)
	{
		return phoRepository.findByBrandEndingWith(suffix);	
	}
	
	public List<PhoneDetails> fetchPhoneDetailsByBrand(String brand)
	{
		return phoRepository.findByBrand(brand)	;
	}
	
	
	

}
