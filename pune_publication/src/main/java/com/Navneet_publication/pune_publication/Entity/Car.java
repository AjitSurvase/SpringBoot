package com.Navneet_publication.pune_publication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Car {
	
	@Id
	private int id;
	
	private String Carname;
	
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarname() {
		return Carname;
	}

	public void setCarname(String carname) {
		Carname = carname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
