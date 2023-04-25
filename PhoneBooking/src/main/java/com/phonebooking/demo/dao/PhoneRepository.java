package com.phonebooking.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebooking.demo.model.PhoneDetails;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneDetails,Integer>{
	

}
