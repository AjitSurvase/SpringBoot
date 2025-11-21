package com.DTO.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTO.demo.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie ,Integer> {

}