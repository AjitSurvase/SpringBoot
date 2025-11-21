package com.Assignment.CarServices.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hq {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;

	private String city;
	
	private String state;
	
	private String pincode;

	
	
	
	public Hq() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Hq(int hid, String city, String state, String pincode) {
		super();
		this.hid = hid;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	
	

	
	
}
