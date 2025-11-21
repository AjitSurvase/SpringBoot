package com.delhi_publication.delhi_publication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.delhi_publication.delhi_publication.Repository.Author_Repo;
import com.delhi_publication.delhi_publication.entity.Author;


@Service
public class Author_service {
	
	@Autowired
	private Author_Repo repo;
	
	
	public Author addauthor(Author author) throws Exception
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
