package com.ebay.ebay_Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ebay.ebay_Services.Componants.order;

@SpringBootApplication
public class EbayServicesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EbayServicesApplication.class, args);
		
		System.out.println("Application has started");
		
		System.out.println("**************************");
		
		
		order order1=context.getBean(order.class);
		
		order order2=context.getBean(order.class);
		
		
		
		
		System.out.println(order1.hashCode());
		System.out.println(order2.hashCode());
		
	
		
		System.out.println(order1 == order2); 
	}

}
