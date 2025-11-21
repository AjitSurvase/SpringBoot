package com.Navneet_publication.pune_publication.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Navneet_publication.pune_publication.Entity.Book;


@Repository
public interface Book_Repo extends JpaRepository<Book,Integer> {
	

}
