package com.sujata.bean;

import java.util.List;

public class Employees {

	List<Employee> empList;
	public Employees(){
		
	}
	public Employees(List<Employee> empList) {
		super();
		this.empList = empList;
	}

	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
