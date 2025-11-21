package com.ajit.ems.employee_management_system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.ems.employee_management_system.Entity.Employee;
import com.ajit.ems.employee_management_system.Service.Employee_Service;

@RestController
public class Employee_Controller {
	
	
	@Autowired
	private Employee_Service service;
	
	
	
//	@PostMapping("/add-emp")
//	public Employee addemployee(@RequestBody Employee Employee)
//	{
//		return service.addEmployee(Employee);
//		
//	}
	
	
	 @GetMapping("/{id}")
	    public Employee getEmployee(@PathVariable int id) {
	        return service.findbyIdEmployee(id);
	    }
	

}
