package com.sujata.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="com.sujata.bean")
public class Employees {

	@XmlElementWrapper(name="empList")
	@XmlElement(name="employee")
	List<Employee> emps;

	public Employees(){
		
	}

	public Employees(List<Employee> emps) {
		super();
		this.emps = emps;
	}

	public List<Employee> getEmployees() {
		return emps;
	}

	public void setEmployees(List<Employee> emps) {
		this.emps = emps;
	}
	
	
}
