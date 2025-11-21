package com.Navneet_publication.pune_publication.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Navneet_publication.pune_publication.Entity.Author;
import com.Navneet_publication.pune_publication.Service.Author_Service;


@RequestMapping("/author-controller")
@RestController
public class Author_Controller {
	
	
	Author_Service service;
	
	public Author_Controller(Author_Service service)
	{
		this.service=service;
	}
	
	
	@PostMapping("/add-Author")
	public Author add(@RequestBody Author author) throws Exception
	{
		System.out.println(author.getAuthorname());
		return service.addAuthor(author);
		
	}

	
	@GetMapping("/get-all-author")
	public List<Author> getall() throws Exception
	{
		
		return service.getall();
	}
}
