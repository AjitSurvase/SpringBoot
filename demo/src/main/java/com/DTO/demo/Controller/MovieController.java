package com.DTO.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.demo.entity.Movie;
import com.DTO.demo.service.MovieService;

@RestController
public class MovieController {
	
	
	
	@Autowired
	private MovieService service;
	
	
	
	@PostMapping("/add-movie")
	public Movie Addmovie(@RequestBody Movie movie)
	{
		return service.addmovie(movie);
	}
	

	@GetMapping("/get-movie-id/{id}")
	@Cacheable("movie")
	public Movie getbyiddd(@PathVariable("id") int id) throws InterruptedException
	{
		
		Thread.sleep(3000);
		System.out.println("from the database");
		return service.findbypk(id);
	}
	
	
	
    @GetMapping("/get-all-movies")
    @Cacheable(value = "allMovies")
    public List<Movie> getAllMovies() throws InterruptedException {
      Thread.sleep(3000); 
        System.out.println("Fetching all movies from DB");
        return service.getAllMovies();
    }

}
