package com.profiles.SpringProfiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/d")
@RestController
public class DemoController {
	
	
	
   @GetMapping("/get")
   public String get()
   {
	return "hello";
	   
	   
   }
	
	
}
