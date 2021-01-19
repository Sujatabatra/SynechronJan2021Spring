package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(int empId);
	int insertEmployee(Employee employee);
	int deleteEmployee(int id);
	int updateSalary(int id,int newSal);
}
