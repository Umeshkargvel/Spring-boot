package com.phonebooking.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
