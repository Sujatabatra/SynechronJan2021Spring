package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmployees() {
		return empDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// to get the object from Optional we use get() method
		// Optional is Java 8 interface to deal with null
		return empDao.findById(id).get();
	}

	public Employee insertEmployee(Employee employee) {
		Employee e = empDao.save(employee);
		return e;
	}

	public Employee updateEmpSalary(int id, int sal) {
		empDao.updateRecord(id, sal);
		Employee e = getEmployeeById(id);
		return e;
	}

	public Employee deleteEmployee(int id) {
		Employee e = getEmployeeById(id);
		if (e != null)
			empDao.deleteById(id);
		return e;
	}

}
