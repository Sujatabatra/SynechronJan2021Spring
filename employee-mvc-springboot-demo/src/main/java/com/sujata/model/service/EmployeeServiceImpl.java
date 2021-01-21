package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.model.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	
	public Employee getEmployeeById(int empId) {
		return employeeDao.getRecordById(empId);
	}

	
	public int insertEmployee(Employee employee) {
		return employeeDao.insertRecord(employee);
	}

	
	public int deleteEmployee(int id) {
		return employeeDao.deleteRecord(id);
	}

	
	public int updateSalary(int id, int newSal) {
		return employeeDao.updateSalary(id, newSal);
	}

}
