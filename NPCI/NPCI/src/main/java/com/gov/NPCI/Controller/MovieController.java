package com.gov.NPCI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gov.NPCI.Classes.Movie;
import com.gov.NPCI.Service.MovieService;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class MovieController {

	
	@Autowired
	private MovieService service;
	
	@GetMapping("/get-movie")
	public String getdet()
	{
		return service.showdetails();
	}
	
	
	@GetMapping("/get-all")
	public List<Movie> getall()
	{
		return service.showallmovies();
	}
	
	@PostMapping("/find-movie")
	public Movie findmovie(@RequestParam String name2) throws Exception
	{
		 return service.searchbyname(name2);
		
	}
	
	@GetMapping("/get-movies")
	public String getde()
	{
		
		return "this is the inside getmovies";
	}
}
