package com.sujata.service;

import com.sujata.bean.Employee;
import com.sujata.bean.Employees;

public interface EmployeeService {

	public Employee serachEmployeeById(int id);
	public Employees getAllEmployees();
	
}
