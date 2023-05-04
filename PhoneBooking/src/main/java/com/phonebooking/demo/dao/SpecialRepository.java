package com.phonebooking.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebooking.demo.model.Special;

@Repository
public interface SpecialRepository extends JpaRepository<Special,Integer>{
	

}
