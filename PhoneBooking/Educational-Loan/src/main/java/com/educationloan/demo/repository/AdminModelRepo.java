package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.entity.AdminModel;

@Repository
public interface AdminModelRepo extends JpaRepository<AdminModel,Integer>{

}
