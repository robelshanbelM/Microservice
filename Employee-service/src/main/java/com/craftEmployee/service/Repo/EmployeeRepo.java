package com.craftEmployee.service.Repo;

import com.craftEmployee.service.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	
	public Employee findByEmployeeId(long empid);
	
	
}
