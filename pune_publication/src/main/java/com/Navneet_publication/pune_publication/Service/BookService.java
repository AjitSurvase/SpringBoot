package com.Navneet_publication.pune_publication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Navneet_publication.pune_publication.Entity.Book;
import com.Navneet_publication.pune_publication.Repostory.Book_Repo;

@Service
public class BookService {
	
	
	@Autowired
	private Book_Repo repo;
	
	
	public Book addbook(Book book) throws Exception
	{
		
		if(book==null)
		{
			throw new Exception("book can't be null");
		}
		System.out.println("recieved book :"+book.getName());
		System.out.println("savinggggg.....");
	    Book book_saved=repo.save(book);
	    System.out.println("book saved......");
	    
	    return  book_saved;
	}  
	
	public List<Book> getall()
	{
		return repo.findAll();
	}
	
	
	
}
