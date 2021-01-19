package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return employeeDao.getRecordById(empId);
	}

	@Override
	public int insertEmployee(Employee employee) {
		return employeeDao.insertRecord(employee);
	}

	@Override
	public int deleteEmployee(int id) {
		return employeeDao.deleteRecord(id);
	}

	@Override
	public int updateSalary(int id, int newSal) {
		return employeeDao.updateSalary(id, newSal);
	}

}
