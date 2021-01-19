package com.sujata.dao;

import java.util.List;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	Employee getRecordById(int empId);
	int insertRecord(Employee employee);
	int deleteRecord(int id);
	int updateSalary(int id,int newSal);
}
