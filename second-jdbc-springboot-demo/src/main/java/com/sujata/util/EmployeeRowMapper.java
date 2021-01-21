package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;


//map the table column name with class property names
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setEmpName(rs.getString("empName"));
		employee.setEmpDesig(rs.getString("desig"));
		employee.setEmpDeptt(rs.getString("depart"));
		employee.setEmpSalary(rs.getInt("basic"));
		return employee;
	}

}
