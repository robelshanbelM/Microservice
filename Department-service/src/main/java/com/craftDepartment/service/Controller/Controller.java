package com.craftDepartment.service.Controller;

import com.craftDepartment.service.Model.Department;
import com.craftDepartment.service.RepoService.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class Controller {

	
	@Autowired
	DepartmentService departmentService;
	
	
	@PostMapping("/")
	
	public Department saveDepartment(@RequestBody Department  department) {
		
		
		return departmentService.saveDepartment(department);
	}
	
	
	@GetMapping("/{id}")
	
	public Department getDepartmentByid(@PathVariable("id")  Long depid )
	{
		
		return departmentService.getDepartmet(depid);
		
	}
}
