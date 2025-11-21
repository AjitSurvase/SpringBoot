package com.delhi_publication.delhi_publication.entity;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String name;
	
	private double ratings;
	
	

	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, double ratings) {
		super();
		this.id = id;
		this.name = name;
		this.ratings = ratings;
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

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	

}
