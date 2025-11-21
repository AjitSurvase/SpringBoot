package com.Assignment.CarServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Assignment.CarServices.Entity.Experience;
import com.Assignment.CarServices.Service.ExperienceService;

@RestController
public class ExperienceController {
	
	@Autowired
	private ExperienceService service;
	
	
	@PostMapping("/add-exp")
	public Experience AddExp(@RequestBody Experience experience)
	{
		
		return service.AddExp(experience);
			
	}
	
	
	@GetMapping("/get-exp/{id}")
	public Experience findexpid(@PathVariable int id)
	{ 
		return service.findexpid(id);
	}


}
