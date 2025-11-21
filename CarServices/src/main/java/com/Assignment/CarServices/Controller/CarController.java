package com.Assignment.CarServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.CarServices.Entity.Car;

import com.Assignment.CarServices.Service.CarService;


@RestController
public class CarController {

	@Autowired
	private CarService service;
	
	
	@PostMapping("/add-car")
	public Car addcar(@RequestBody Car car)
	{
		return service.addcar(car);
	}
	
	
	@GetMapping("/get-car/{id}")
	public Car findcarid(@PathVariable int id)
	{ 
		return service.findcarid(id);
	}
	
	
}
