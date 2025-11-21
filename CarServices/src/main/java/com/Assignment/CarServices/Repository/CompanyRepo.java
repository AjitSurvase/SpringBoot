package com.Assignment.CarServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.CarServices.Entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

	
	
}
