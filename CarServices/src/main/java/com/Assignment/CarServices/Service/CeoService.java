package com.Assignment.CarServices.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Assignment.CarServices.Entity.Ceo;
import com.Assignment.CarServices.Repository.CeoRepo;

@Service
public class CeoService {

	
	@Autowired
	private CeoRepo repo;
	
	
	public Ceo addCeo(Ceo ceo)
	{
		return repo.save(ceo);
		
	}
	

	public Ceo findceoid(int ceid)
	{
		return repo.findById(ceid).get();
	}
}
