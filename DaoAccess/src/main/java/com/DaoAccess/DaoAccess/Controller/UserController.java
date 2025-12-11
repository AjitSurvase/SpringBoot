package com.DaoAccess.DaoAccess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DaoAccess.DaoAccess.Entity.UserEntity;
import com.DaoAccess.DaoAccess.Service.MailSenderService;
import com.DaoAccess.DaoAccess.Service.UserService;

import jakarta.mail.MessagingException;


@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class UserController {

	
		
		@Autowired
		private UserService service;
		
		@Autowired
		private MailSenderService service2;
		
		@PostMapping("/add-user")
		public UserEntity adduser(@RequestBody UserEntity entity) throws MessagingException
		{

			service2.htmlmail1(entity.getUserEmail(), entity.getUserName());
		
			
			List<String> roles=entity.getUserRoles();
			roles.stream().forEach(i->System.out.println(i));
			return service.addUser(entity);
		}
		

		@GetMapping("/get-users")
		public List<UserEntity> getall()
		{
			return service.getallusers();
		}

}
