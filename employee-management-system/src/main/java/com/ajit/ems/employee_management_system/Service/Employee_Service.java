package com.ajit.ems.employee_management_system.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.ems.employee_management_system.Entity.Employee;
import com.ajit.ems.employee_management_system.Repository.Employee_Repo;


@Service
public class Employee_Service {
	
	
	@Autowired
	private Employee_Repo repo;

	
	
	 // ❌ Do NOT use this for User–Employee save
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee findbyIdEmployee(int id) {
        return repo.findById(id).orElse(null);
    }
}




//	public List<Employee> getSortedEmployeesByDepartment(List<Employee> employees) {
//	    return employees.stream()
//	        .sorted(Comparator.comparing(Employee::getDepartment))
//	        .collect(Collectors.toList());
//	}


	

	
	
	

