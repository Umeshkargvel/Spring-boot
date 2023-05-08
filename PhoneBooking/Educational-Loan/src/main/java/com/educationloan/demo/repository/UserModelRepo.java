package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.entity.UserModel;

@Repository
public interface UserModelRepo extends JpaRepository<UserModel,Integer>{

}
