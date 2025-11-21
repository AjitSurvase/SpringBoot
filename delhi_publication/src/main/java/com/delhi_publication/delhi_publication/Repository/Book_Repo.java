package com.delhi_publication.delhi_publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delhi_publication.delhi_publication.entity.Book;

@Repository
public interface Book_Repo extends JpaRepository<Book,Integer> {

}
