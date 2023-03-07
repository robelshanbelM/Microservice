package com.craftEmployee.service.RepoServeice;

import com.craftEmployee.service.DepartmentMappingObject.Department;
import com.craftEmployee.service.Repo.EmployeeRepo;
import com.craftEmployee.service.ReturnObject.ResponseObjects;
import com.craftEmployee.service.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepo employeeRepo;
	
	//save employee
	
	public Employee saveEmployee(Employee employee) {
		
		
		return employeeRepo.save(employee);
	}
	
	// get department details  form department service
	
	
	@Autowired
	RestTemplate restTemplate;
	
	public ResponseObjects  reponse(Long id) {
		
		
		Employee employee=employeeRepo.findByEmployeeId(id);
		
		Department department=restTemplate.getForObject("http://localhost:9001/departments/" + 
		employee.getEmployeeId(), Department.class);
		
		
		ResponseObjects responseObjects= new ResponseObjects();
		
		
		responseObjects.setDepartment(department);
		responseObjects.setEmployee(employee);
		return  responseObjects;
		
		
	}
	
	
	
}
