package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@Component
public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	@Autowired
	private EmployeeService empService;

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Insert Employee");
		System.out.println("4. Modify Salary of an Employee ");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		switch(choice){
		case 1:
			List<Employee> employees=empService.getAllEmployees();
			for(Employee employee:employees){
				System.out.println(employee);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID whoes record you want to search : ");
			int id=sc.nextInt();
			Employee emp=empService.getEmployeeById(id);
			if(emp!=null)
			System.out.println(emp);
			else
				System.out.println("Employee with id "+id +" does not exist");
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int i = sc.nextInt();
			System.out.println("Enter Employee Name : ");
			String na = sc.next();
			System.out.println("Enter Employee Designation : ");
			String des = sc.next();
			System.out.println("Enter Employee Department : ");
			String dep = sc.next();
			System.out.println("Enter Employee Salary : ");
			int sal = sc.nextInt();
			Employee employee = new Employee(i, na, des, dep, sal);
			if(empService.insertEmployee(employee))
				System.out.println("Employee Record Inserted");
			else
				System.out.println("Employee Record Not Inserted");
			break;
		case 4:
			System.out.println("Enter employee id whoes rsalary you want to update : ");
			int eid=sc.nextInt();
			System.out.println("Enter new Salary : ");
			int salary=sc.nextInt();
			if(empService.updateEmpSalary(eid, salary))
				System.out.println("Salary Updated Succesfully");
			else
				System.out.println("Salary can't be updated!!");
			break;
		case 5:
			System.out.println("Have a Nice Day!!");
			System.exit(0);
		}

	}

}
