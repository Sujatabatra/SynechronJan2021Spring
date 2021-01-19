package com.sujata.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sujata.bean.Employee;
import com.sujata.util.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> getAllRecords() {
		List<Employee> employees=jdbcTemplate.query("select * from empl", new EmployeeRowMapper());
		return employees;
	}

	@Override
	public Employee getRecordById(int empId) {
		Employee employee=jdbcTemplate.queryForObject("select * from empl where empid=?",new Object[]{empId}, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public int insertRecord(Employee employee) {
		
		/*
		 * statement=connection.createStatement();
			int rows=statement.executeUpdate("INSERT INTO EMPL VALUE(104,'DDDDD','EXECUTUVE','IT',123456)");
			connection.close();
			plus we need not to take care of checked exceptions as well
		 */
		int rows=jdbcTemplate.update("insert into empl values(?,?,?,?,?)", employee.getEmpId(),employee.getEmpName(),employee.getEmpDesig(),employee.getEmpDeptt(),employee.getEmpSalary());
		return rows;
	}

	@Override
	public int deleteRecord(int id) {
		String query="delete from empl where empid=?";
		int rows=jdbcTemplate.update(query, id);
		return rows;
	}

	@Override
	public int updateSalary(int id, int newSal) {
		String query="update empl set basic=? where empid=?";
		int rows=jdbcTemplate.update(query, newSal,id);
		return rows;
	}

}
