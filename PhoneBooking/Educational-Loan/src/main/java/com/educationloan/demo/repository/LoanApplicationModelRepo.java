package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.entity.LoanApplicationModel;

@Repository
public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel,Integer>{

}
