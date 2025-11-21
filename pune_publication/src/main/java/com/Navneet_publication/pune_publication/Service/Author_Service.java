package com.Navneet_publication.pune_publication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Navneet_publication.pune_publication.Entity.Author;
import com.Navneet_publication.pune_publication.Repostory.Author_Repo;

@Service
public class Author_Service {

	
	Author_Repo repo;
	
	
	
	public Author_Service(Author_Repo repo) {
		
		this.repo=repo;
	}
	
	public Author addAuthor(Author author) throws Exception
	{
		if(author==null)
		{
			throw  new Exception ("can't be null");
		}
		return repo.save(author);
		
	}
	
       public List<Author> getall() throws Exception{
		
		if(  !repo.findAll().isEmpty())
		{
			return repo.findAll();
		}
		throw new Exception ("Something went wrong ");
	}
	
}
