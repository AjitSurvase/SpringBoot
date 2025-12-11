package com.DaoAccess.DaoAccess.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.DaoAccess.DaoAccess.Entity.UserEntity;
import com.DaoAccess.DaoAccess.Repository.UserRepo;

@Component
public class UserDetailsSserviceimpl implements UserDetailsService  {

	
	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  
		UserEntity userent=  repo.loadbyname(username);
		
		return new UserPrincipal(userent);
		/**
		 * USerPrincipal IS-A UserDetails
		 */
	} 
}
