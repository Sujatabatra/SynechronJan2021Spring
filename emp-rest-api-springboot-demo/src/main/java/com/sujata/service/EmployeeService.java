package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public Employee insertEmployee(Employee employee);
	public Employee updateEmpSalary(int id,int sal);
	public Employee deleteEmployee(int id);
}
