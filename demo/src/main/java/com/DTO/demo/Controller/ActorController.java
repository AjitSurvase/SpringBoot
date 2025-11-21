package com.DTO.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.demo.DTO.ActorDto;
import com.DTO.demo.entity.Actor;
import com.DTO.demo.service.ActorService;

@RestController
public class ActorController {

	
	@Autowired
	private ActorService service;
	
	
	@PostMapping("/add-actor")
	public Actor addactor(@RequestBody Actor act)
	{
		return service.addActor(act);
		
	}
	
//	@GetMapping("/get-actor-id/{id}")
//	public Actor getbyiddd(@PathVariable("id") int id)
//	{
//		return service.getbyidact(id);
//	}
//	
	
	
	
//	@GetMapping("/get-actor-id/{id}")
//	public ActorDto getbyiddd(@PathVariable("id") int id)
//	{
//		return service.getbyidact(id);
//	}
	
	
	
	
	
	@GetMapping("/get-actor-id/{id}")
	public Actor getbyiddd(@PathVariable("id") int id)
	{
		return service.getbyidact(id);
	}
	
	
	
}
