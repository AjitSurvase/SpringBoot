package com.Navneet_publication.pune_publication.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Navneet_publication.pune_publication.Entity.Book;
import com.Navneet_publication.pune_publication.Entity.Car;
import com.Navneet_publication.pune_publication.Service.BookService;


@RequestMapping("/book-controller")

@RestController
@CrossOrigin(allowedHeaders = "*")
public class Controller {

	
	@Autowired
	private BookService service;
	
	

	@PostMapping("/add-book")
	public Book addbookcontroller(@RequestBody Book book) throws Exception
	{
		
		return service.addbook(book);
	}
	
	@GetMapping("/get-all-books")
	public List<Book>getall()
	{
		return service.getall();
	}
	
	@PostMapping("/add-car")
	public Car addcar(@RequestBody Car car)
	{
		return addcar(car);
	}
	
	@PostMapping("/add-car1")
	public String addCar(@RequestBody Car car) {
	    System.out.println(car.getCarname());
	    System.out.println(car.getId());
	    System.out.println(car.getPrice());
	    return "Car added:" + car.getCarname() + " welcome  ...........,";
	}
	
	
}
