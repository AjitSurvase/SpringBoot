package com.DaoAccess.DaoAccess.Service;

import java.util.List;

import com.DaoAccess.DaoAccess.Entity.UserEntity;

public interface UserServiceInterface {
	
public UserEntity addUser(UserEntity entity);
	
	public List<UserEntity> getallusers();

}
