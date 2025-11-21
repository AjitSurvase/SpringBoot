package com.DTO.demo.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTO.demo.DTO.ActorDto;
import com.DTO.demo.Repository.ActorRepo;
import com.DTO.demo.entity.Actor;

@Service
public class ActorService {
	
	
	@Autowired
	public ActorRepo repo;
	
	
	
	public Actor addActor(Actor actor)
	{
		return repo.save(actor);
		
	}
	
	//this is for find by id:
	
//	public Actor getbyidact(int id)
//	{
//		return repo.findById(id).get();
//	}
	
	
	//this is for Actor DTO :
	
//	public ActorDto getbyidact(int id)
//	{
//		return (converter(repo.findById(id).get()));
//	}
//	
	
	
	public Actor getbyidact(int id)
	{
		return (repo.findById(id).get());
	}
	

	
//	public static ActorDto converter( Actor act)
//	{
//		  ActorDto dto=new ActorDto();
//		  
//		  dto.setAname(act.getAname());
//		  
//		 dto.setName(act.getMovies().getName());
//		  
//		  //dto.setMovies(act.getMovies().stream().map(actorservice::con2).collect(Collectors.toList()));
//		  
//		 
//		  return dto;
		  
	}
	
	
	


