package com.ajit.ems.employee_management_system.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Name;
	
    private String Email;
    
    private String Designation; 
    
	private String Department;
	
	private Double salary;
    
  
    @OneToOne(mappedBy = "employee")
    @JsonBackReference
	private User user;
	
	
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String email, String designation, String department, Double salary) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Designation = designation;
		Department = department;
		this.salary = salary;
	}

	public String getDesignation() {
		return Designation;
	}

	

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public Employee(String designation) {
		super();
		Designation = designation;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
