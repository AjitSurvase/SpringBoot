package com.Assignment.CarServices.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.CarServices.Entity.Experience;
import com.Assignment.CarServices.Repository.ExperienceRepo;

@Service
public class ExperienceService {
	
	
	@Autowired
	private ExperienceRepo repo;
	
	
	public Experience AddExp(Experience expe)
	{
		return repo.save(expe);
	}
	

	public Experience findexpid(int eid)
	{
		return repo.findById(eid).get();
	}

}
