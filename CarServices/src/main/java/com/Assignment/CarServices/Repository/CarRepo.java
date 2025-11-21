package com.Assignment.CarServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assignment.CarServices.Entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{

}
