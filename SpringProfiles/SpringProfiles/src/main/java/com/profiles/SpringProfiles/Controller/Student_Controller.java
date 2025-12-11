package com.profiles.SpringProfiles.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.SpringProfiles.Entity.Student;
import com.profiles.SpringProfiles.Exception.StudentExist;
import com.profiles.SpringProfiles.Repository.StudentRepo;


//@RequestMapping("/")
@RestController
public class Student_Controller {
	
	   
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/add")
	public String addstudent(@RequestBody Student student)
	{
		if(student.getId()==25)
		{
			throw new StudentExist("student is already present...");
		}
		 repo.save(student);
		 return "ok";
	}
	
//	
//	@ExceptionHandler(StudentExist.class)
//	public String handleit(StudentExist ex)
//	{
//	    String str = ex.getMessage();
//	    return str;
//	}

	
	@ExceptionHandler(StudentExist.class)
	public ResponseEntity<Map<String, String>> handleit(StudentExist ex)
	{
	    Map<String, String> mp = new HashMap<>();
	    mp.put("conflict", ex.getMessage());
	    return ResponseEntity.status(HttpStatus.CONFLICT).body(mp);
	}

	
}
