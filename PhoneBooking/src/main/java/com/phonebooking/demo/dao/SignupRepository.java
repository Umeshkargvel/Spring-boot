package com.phonebooking.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebooking.demo.model.UserDetails;
import com.phonebooking.demo.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup,Integer>{
	UserDetails findByEmailid(String username);
	Optional<Signup> findOneByUsernameAndPassword(String username,String password);
	

}
