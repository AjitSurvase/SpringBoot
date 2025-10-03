package com.ebay.ebay_Services.Controller.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebay.ebay_Services.Componants.order;

@RestController
public class OrderController {


	
	@Autowired
	private order order1;
	
	@GetMapping("/hi")
	public String greeting() {
		
		return "hello from the spring boot Application";
		
	}
	
	@GetMapping("/getcode")
	public Object getre()
	{
		return order1.getdet();
	}
	
	
	@GetMapping("/getcode_2")
	public Object getre2()
	{
		return order1.getdet();
	}
	
}
