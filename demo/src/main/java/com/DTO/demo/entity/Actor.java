package com.DTO.demo.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(nullable = false)
	private String aname;
	
	private String mobile;
	
	private String address;
	
	@JoinColumn
	//@OneToOne                         //@OneToOne for one actor and movie name &
	@OneToMany
	//private  Movie movies;
	  
	private  List<Movie> movies;
	  

	public List<Movie> getMovies() {
		return movies;
	}


	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}



	public String getAddress() {
		return address;
	}


//
//	public Movie getMovies() {
//		return movies;
//	}
//
//
//
//	public void setMovies(Movie movies) {
//		this.movies = movies;
//	}
//


	public void setAddress(String address) {
		this.address = address;
	}



	public int getId() {
		return id;
	}

	

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
