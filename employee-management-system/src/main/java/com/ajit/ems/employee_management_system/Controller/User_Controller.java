package com.ajit.ems.employee_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.ems.employee_management_system.Entity.User;
import com.ajit.ems.employee_management_system.Service.User_service;

@RestController
@RequestMapping("/user")
public class User_Controller {
	
	@Autowired
	private User_service service;
	
	

    // Add User + Employee
    @PostMapping("/add")
    public User adduser(@RequestBody User user) {
        return service.adduser(user);
    }

    // Get User by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return service.Findbyid(id);
    }
}