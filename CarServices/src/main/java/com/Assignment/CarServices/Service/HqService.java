package com.Assignment.CarServices.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Assignment.CarServices.Entity.Hq;
import com.Assignment.CarServices.Repository.HqRepo;

@Service
public class HqService {
	
	@Autowired
	private HqRepo repo;
	
	
	public Hq addhq(Hq hq)
	{
		return repo.save(hq);
			
	}
	
	public Hq findhqid(int hid)
	{
		return repo.findById(hid).get();
	}

}
