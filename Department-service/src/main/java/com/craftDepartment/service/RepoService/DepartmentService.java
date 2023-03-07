package com.craftDepartment.service.RepoService;

import com.craftDepartment.service.Model.Department;
import com.craftDepartment.service.Repo.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	
	@Autowired
	DepartmentRepository departmentRepository;	
	
	
	//save department
	
	public Department saveDepartment(Department department) {
		
		
		return departmentRepository.save(department);
	}
	
	// get department by id
	
	
	public Department getDepartmet(Long depid) {
		
		
		return departmentRepository.findByDepartmentId(depid);
	}
	
	
	
	
	
}
