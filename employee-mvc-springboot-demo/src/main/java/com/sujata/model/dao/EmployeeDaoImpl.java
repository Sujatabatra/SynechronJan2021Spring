package com.sujata.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;
import com.sujata.model.util.EmployeeRowMapper;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public List<Employee> getAllRecords() {
		List<Employee> employees=jdbcTemplate.query("select * from empl", new EmployeeRowMapper());
		return employees;
	}

	
	public Employee getRecordById(int empId) {
		Employee employee=jdbcTemplate.queryForObject("select * from empl where empid=?",new Object[]{empId}, new EmployeeRowMapper());
		return employee;
	}

	
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

	
	public int deleteRecord(int id) {
		String query="delete from empl where empid=?";
		int rows=jdbcTemplate.update(query, id);
		return rows;
	}

	
	public int updateSalary(int id, int newSal) {
		String query="update empl set basic=? where empid=?";
		int rows=jdbcTemplate.update(query, newSal,id);
		return rows;
	}

}
