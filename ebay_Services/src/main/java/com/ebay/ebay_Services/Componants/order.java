package com.ebay.ebay_Services.Componants;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Scope("prototype")                                                              //@SessionScope                                                  //@RequestScope                                              // @Scope("prototype")                                   // 1.singleton   2.prototype 3.request
public class order {

	public order()
	{
		System.out.println("order created");
		counter++;
	}
	
	public static int counter=0;
	
	
	
	
	
	public Object getdet()
	{
		return this.hashCode();
	}
	
}
