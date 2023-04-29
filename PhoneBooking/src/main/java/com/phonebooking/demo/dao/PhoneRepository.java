package com.phonebooking.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebooking.demo.model.PhoneDetails;


@Repository
public interface PhoneRepository extends JpaRepository<PhoneDetails,Integer>{
	

	List<PhoneDetails> findByBrandStartingWith(String prefix);
	List<PhoneDetails> findByBrandEndingWith(String suffix);
	List<PhoneDetails> findByBrand(String brand);
	

	
}
