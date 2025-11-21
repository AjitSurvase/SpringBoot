package com.Assignment.CarServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Assignment.CarServices.Entity.Hq;
import com.Assignment.CarServices.Service.HqService;

@RestController
public class HqController {
	
	@Autowired
	private HqService service;
	
	@PostMapping("/add-hq")
	public Hq addhq(@RequestBody Hq hq)
	{
		return service.addhq(hq);
		
	}
	
	@GetMapping("/get-hq/{id}")
	public Hq findhqoid(@PathVariable int id)
	{ 
		return service.findhqid(id);
	}


}
