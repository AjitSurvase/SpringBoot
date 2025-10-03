package com.gov.NPCI.Classes;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	public String name;
	
	
	public String collection;
	
	
	public double ratings;
	
	
	
	public Movie()
	{
		System.out.println("Movie created...");
	}
	
	public Movie(String name,String collection, double ratings )
	{
		        this.collection=collection;
				this.name=name;
				this.ratings=ratings;
		
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", collection=" + collection + ", ratings=" + ratings + "]";
	}


}
