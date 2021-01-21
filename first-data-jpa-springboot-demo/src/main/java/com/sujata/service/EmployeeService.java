package com.sujata.service;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public boolean insertEmployee(Employee employee);
	public boolean updateEmpSalary(int id,int sal);
}
