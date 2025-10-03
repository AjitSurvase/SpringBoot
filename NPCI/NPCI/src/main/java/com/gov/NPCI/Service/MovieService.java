package com.gov.NPCI.Service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.Classes.Movie;

@Service
public class MovieService {

	
	@Autowired
	private Movie movie;
	
	
	public String showdetails()
	{
		String col="100";
		String name="dr.snow";
		double rating=9.1;
		
		movie.collection=col;
		movie.name=name;
		movie.ratings=rating;
		
		if(movie.ratings>9.0)
		{
			return movie.toString();
		}
				
		
		
		return "not a good movie";
		
	
	}
	
	public List<Movie> addMovies()
	{
		List<Movie>list=Arrays.asList
			   (new Movie("dhadak","400cr",9.9),
				new Movie("sairat","200cr",9.9),
				new Movie("batman","100cr",8.9),
				new Movie("ddlj", "300cr",9.9),
				new Movie("kakan","200cr",10.0),
				new Movie("sholey","150cr",9.9)
				);
		
	
		return list;
				
				
	}
	
//	public List<Movie> showallmovies()
//	{
//		return  addMovies().stream().sorted((i,j)->
//		((int)j.ratings-(int)i.ratings)).collect(Collectors.toList());
//	}
//	
	public List<Movie> showallmovies()
	{
		
		return  addMovies().stream().sorted((i,j)->
		((int)j.ratings-(int)i.ratings)).collect(Collectors.toList());
	}
	
	public Movie searchbyname(String name2) throws Exception
	{
		
		System.out.println("got the value from the controller:"+name2);
		List<Movie> list=addMovies();
		
		Iterator<Movie> itr=list.iterator();
		
		System.out.println("Searching the movie......"+name2);
		Movie m2=new Movie();
		while(itr.hasNext())
		{
			Movie movie=itr.next();
			if((movie.name).equalsIgnoreCase(name2))
			{
				System.out.println("Movie:Found:"+name2);
				m2= movie;
				break;
			}
			else
			{
				m2=null;
				
			}
		}
		if(m2==null)
		{
			System.out.println("plese enter coorect movie name !");
			throw new Exception("Movie not found");
		}
		return m2;
	} 
}
	
	

		 
	
	
	

