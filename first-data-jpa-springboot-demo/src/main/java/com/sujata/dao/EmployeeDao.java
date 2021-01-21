package com.sujata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Employee;

@Transactional// if my interface is having any DML-Data Manipulation language(insert,delete,update) operation
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Modifying // this annotation is required if we are writing DML operation in Query
	@Query("update Employee set empSalary=:salary where empId=:i") //give class name and field names while writing the query rather then giving table and column names
	public void updateRecord(@Param(value="i")int id,@Param(value="salary")int sal);
}
