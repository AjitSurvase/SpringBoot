package com.DTO.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoProjectForDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectForDtoApplication.class, args);
		
		  
	}

}
