package com.ajit.ems.employee_management_system.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
     private String Username;
	
	 private String Password;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "employee_id")
	 @JsonManagedReference
	 private Employee employee;
	 
	 
	


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String username, String password) {
		super();
		this.uid = uid;
		Username = username;
		Password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

}
