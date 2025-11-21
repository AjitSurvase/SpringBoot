package com.ajit.ems.employee_management_system.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ajit.ems.employee_management_system.Entity.Employee;
import com.ajit.ems.employee_management_system.Entity.User;
import com.ajit.ems.employee_management_system.Repository.User_Repo;

@Service
public class User_service {
	
	@Autowired
	private User_Repo repo;
	
	
	 public User adduser(User user) {

	        // Get employee from request
	        Employee emp = user.getEmployee();

	        // Maintain Bidirectional Link
	        if (emp != null) {
	            emp.setUser(user);     // IMPORTANT !!!
	        }

	        return repo.save(user);
	    }

	    public User Findbyid(int id) {
	        return repo.findById(id).orElse(null);
	    }
	}