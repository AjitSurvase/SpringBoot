package com.security.RBA.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	/**
	 * this class is the root now for :security.
	 * csrf: Cross Site Request Forgery
	 * 
	 * {noop}:if you do not want default password encoder. then use noop ie. no password encoder.
	 * @throws Exception 
	 */
	
	@Bean
	public SecurityFilterChain mysecurity(HttpSecurity http) throws Exception
	{
		http.csrf()
		.disable()
		.authorizeHttpRequests()
		.requestMatchers(HttpMethod.POST).permitAll()
		.anyRequest().authenticated()
		.and()
		.httpBasic();
		
		
		return http.build();
		
	}
	@Bean 
	public UserDetailsService getuser()
	{
		
		
		UserDetails user_1=User.builder().username("Ajit").password("{noop}Ajit@123").build();
		
		
		UserDetails user_2=User.builder().username("Prasad").password("{noop}Prasad@123").build();
		
		return new InMemoryUserDetailsManager(user_1,user_2);
		
	}
	
	

}
