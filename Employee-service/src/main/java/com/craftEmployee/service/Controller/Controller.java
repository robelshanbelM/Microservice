package com.craftEmployee.service.Controller;

import com.craftEmployee.service.RepoServeice.EmployeeService;
import com.craftEmployee.service.ReturnObject.ResponseObjects;
import com.craftEmployee.service.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/employees")
public class Controller {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/")
	
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		
		return employeeService.saveEmployee(employee); 
		
	}
	
	@GetMapping("/{id}")
	public ResponseObjects getdepartmentDestails(@PathVariable ("id") Long id) {
		
		
		return employeeService.reponse(id);
	}
}
