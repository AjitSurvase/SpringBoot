package com.delhi_publication.delhi_publication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delhi_publication.delhi_publication.Service.Book_service;
import com.delhi_publication.delhi_publication.entity.Book;

@RestController
public class Book_controller {
	
	@Autowired
	private Book_service service;
	

	@PostMapping("/add-book")
	public Book addbook(@RequestBody Book book)
	{
		return book;
		
	}

}
