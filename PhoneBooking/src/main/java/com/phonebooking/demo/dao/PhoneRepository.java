package com.phonebooking.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.phonebooking.demo.model.PhoneDetails;


@Repository
public interface PhoneRepository extends JpaRepository<PhoneDetails,Integer>{
	
	
	@Query("select p from PhoneDetails p where p.brand=?1 and p.modelname=?2")
	public List<PhoneDetails>getModelNameByBrand(String brand,String modelname);
	
	@Query("select p from PhoneDetails p where p.brand=:brand")
	public List<PhoneDetails>getBrand(String brand);
	
	//DML
	@Modifying
	@Query("delete from PhoneDetails p where p.brand=?1")
	public int deleteByBrandname(String brand);
	
	@Modifying
	@Query("update PhoneDetails p set p.modelname=?1 where p.modelid=?2")
	public int updateByModelname(String modelname,int brandid);
	

	
	List<PhoneDetails> findByBrandStartingWith(String prefix);
	List<PhoneDetails> findByBrandEndingWith(String suffix);
	List<PhoneDetails> findByBrand(String brand);
	

	
}
