package com.Assignment.CarServices.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.CarServices.Entity.Car;
import com.Assignment.CarServices.Repository.CarRepo;



@Service
public class CarService {

	
	@Autowired
	private CarRepo repo;
	
	
	public Car addcar(Car car)
	{
		return repo.save(car);
		
	}
	
	
	public Car findcarid(int id)
	{
		return repo.findById(id).get();
	}


	
	
}
