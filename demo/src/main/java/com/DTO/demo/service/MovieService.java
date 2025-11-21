package com.DTO.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DTO.demo.Repository.MovieRepo;
import com.DTO.demo.entity.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo repo;
	
	
	public Movie addmovie(Movie movie)
	{
		return repo.save(movie);
	}
	
	
	public Movie findbypk(int id)
	{
		return repo.findById(id).get();
	}


	public List<Movie> getAllMovies() {
        return repo.findAll();
    }
}


	


