package com.Assignment.CarServices.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.CarServices.Entity.Company;
import com.Assignment.CarServices.Repository.CompanyRepo;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepo repo;
	

	public Company addcomp(Company company )
	{
		return repo.save(company);
	}
	

	public Company findcompanyid(int cid)
	{
		return repo.findById(cid).get();
	}
	
}
