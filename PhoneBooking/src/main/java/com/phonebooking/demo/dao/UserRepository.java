package com.phonebooking.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebooking.demo.model.UserDetails;

@Repository

public interface UserRepository extends JpaRepository<UserDetails,Integer>{
	UserDetails findByEmail(String email);

}
