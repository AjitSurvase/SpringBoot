package com.Assignment.CarServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Assignment.CarServices.Entity.Ceo;
import com.Assignment.CarServices.Service.CeoService;

@RestController
public class CeoController {
	
	@Autowired
	private CeoService service;
	
	
    @PostMapping("/add-ceo")
    public Ceo addceo(@RequestBody Ceo ceo)
    {
		return service.addCeo(ceo);
    	
    }
    
    @GetMapping("/get-ceo/{id}")
	public Ceo findceoid(@PathVariable int id)
	{ 
		return service.findceoid(id);
	}

}
