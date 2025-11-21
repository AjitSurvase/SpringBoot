package com.ajit.ems.employee_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajit.ems.employee_management_system.Entity.User;

@Repository 
public interface User_Repo extends JpaRepository<User, Integer> {

	
}
