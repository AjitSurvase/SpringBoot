package com.DaoAccess.DaoAccess.Config;

import java.util.Collection;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.DaoAccess.DaoAccess.Entity.UserEntity;



public class UserPrincipal implements UserDetails{

private UserEntity entity;
	
	public UserPrincipal(UserEntity entity)
	{
		this.entity=entity;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
        
		
		return entity.getUserRoles().stream()
				.map(SimpleGrantedAuthority::new).toList();
                     
                     
	}

	@Override
	public String getPassword() {
		
		return entity.getUserPassword();
	}

	@Override
	public String getUsername() {
		return entity.getUserName();
	}

}
