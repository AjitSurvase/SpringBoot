package com.Assignment.CarServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Assignment.CarServices.Entity.Company;

import com.Assignment.CarServices.Service.CompanyService;

@RestController
public class CompanyController {
	
	
	@Autowired
	private CompanyService service;
	
	
	@PostMapping("/add-company")
	public Company addcomp(@RequestBody Company company )
	{
		return service.addcomp(company);
	}
	


	@GetMapping("/get-company/{id}")
	public Company findcompanyid(@PathVariable int id)
	{ 
		return service.findcompanyid(id);
	}

}
