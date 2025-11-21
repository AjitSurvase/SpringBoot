package com.DTO.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DTO.demo.entity.Actor;
import com.DTO.demo.entity.Movie;

public interface ActorRepo extends JpaRepository< Actor ,Integer> {

}
