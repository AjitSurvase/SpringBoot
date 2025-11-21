package com.delhi_publication.delhi_publication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String authorname;
	
	private String email;
	
	
	

	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Author(int id, String authorname, String email) {
		super();
		this.id = id;
		this.authorname = authorname;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
}
