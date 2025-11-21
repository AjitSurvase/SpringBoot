package com.Navneet_publication.pune_publication.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Navneet_publication.pune_publication.Entity.Author;

@Repository
public interface Author_Repo extends JpaRepository<Author, Integer> {

}
