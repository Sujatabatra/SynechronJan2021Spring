package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//Mapping class with table in database using JPA annotations
@Entity //Mandatory annotation
@Table(name="empl") //if we are not giving @table then name of the table will b same as that of class
@XmlRootElement(name="employee") //JAXB Annotation
public class Employee {
	

	@Column(name="EmpId") // if we are not giving @Column then name of column will b same as that of field
	@Id //primary key in table (Mandatory)
	private int empId;
	@Column(name="EmpName")
	private String empName;
	@Column(name="Desig")
	private String empDesig;
	@Column(name="Depart")
	private String empDeptt;
	@Column(name="Basic")
	private int empSalary;
	
	public Employee(){
		
	}

	public Employee(int empId, String empName, String empDesig, String empDeptt, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDeptt = empDeptt;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getEmpDeptt() {
		return empDeptt;
	}

	public void setEmpDeptt(String empDeptt) {
		this.empDeptt = empDeptt;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", empDeptt=" + empDeptt
				+ ", empSalary=" + empSalary + "]";
	}
	
	
}
