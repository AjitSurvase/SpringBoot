package com.ajit.ems.employee_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajit.ems.employee_management_system.Entity.Employee;

@Repository
public interface Employee_Repo extends JpaRepository<Employee, Integer> {

}
