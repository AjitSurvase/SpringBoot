package com.Assignment.CarServices.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Eid;
	
	private String Ecompany;
	
	private String tenure;
	
	private int year;

	
	
	
	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Experience(int eid, String ecompany, String tenure, int year) {
		super();
		Eid = eid;
		Ecompany = ecompany;
		this.tenure = tenure;
		this.year = year;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEcompany() {
		return Ecompany;
	}

	public void setEcompany(String ecompany) {
		Ecompany = ecompany;
	}

	

	
	
	
	
	
}
