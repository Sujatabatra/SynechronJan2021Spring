package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;
import com.sujata.bean.Employees;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Employee serachEmployeeById(int id) {
		Employee employee=restTemplate.getForObject("http://localhost:8085/employees/"+id, Employee.class);
		return employee;
	}

	@Override
	public Employees getAllEmployees() {
		Employees employees=restTemplate.getForObject("http://localhost:8085/employees", Employees.class);
		return employees;
	}

}
