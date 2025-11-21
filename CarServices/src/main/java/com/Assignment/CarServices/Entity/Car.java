package com.Assignment.CarServices.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private double price;
	
	private String engine;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id")
	private Company company;

	

	
	
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String name, double price, String engine, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engine = engine;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	

	
	
	
	
	
	

	
	
	
}
