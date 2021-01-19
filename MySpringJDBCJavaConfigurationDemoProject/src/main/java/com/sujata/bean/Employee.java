package com.sujata.bean;

public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private String empDeptt;
	private int empSalary;

	public Employee() {

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
