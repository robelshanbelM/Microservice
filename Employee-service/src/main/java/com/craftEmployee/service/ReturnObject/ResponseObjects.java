package com.craftEmployee.service.ReturnObject;

import com.craftEmployee.service.DepartmentMappingObject.Department;
import com.craftEmployee.service.model.Employee;

public class ResponseObjects {

	
	private Department department;
	private Employee employee;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
