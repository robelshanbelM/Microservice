package com.craftDepartment.service.Repo;

import com.craftDepartment.service.Model.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentId(Long depid); 
	
	
	
	
}
