package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@Component("empUi")
public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees ");
		System.out.println("2. Search Employee By ID ");
		System.out.println("3. Insert Employee");
		System.out.println("4. Delete Employee By ID");
		System.out.println("5. Update Employee Salary By ID");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee emp:employees){
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Enter Employee ID to be serached for : ");
			int i=scanner.nextInt();
			Employee e=employeeService.getEmployeeById(i);
			if(e!=null)
				System.out.println(e);
			else
				System.out.println("No employee exist with id "+i);
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int id = scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String na = scanner.next();
			System.out.println("Enter Employee Designation : ");
			String des = scanner.next();
			System.out.println("Enter Employee Department : ");
			String dep = scanner.next();
			System.out.println("Enter Employee Salary : ");
			int sal = scanner.nextInt();
			Employee employee = new Employee(id, na, des, dep, sal);
			int rows = employeeService.insertEmployee(employee);
			if (rows > 0)
				System.out.println("Employee Record Inserted");
			else
				System.out.println("Employee Record Not Inserted");
			break;
		case 4:
			System.out.println("Enter Employee ID whoes Record you want to Delete : ");
			int eId = scanner.nextInt();
			int row = employeeService.deleteEmployee(eId);
			if (row > 0)
				System.out.println("Employee Record Deleted");
			else
				System.out.println("Employee Record Not Deleted");
			break;
		case 5:
			System.out.println("Enter Employee ID whoes Salary you want to Update : ");
			int empId=scanner.nextInt();
			System.out.println("Enter Updated Salary : ");
			int eSal=scanner.nextInt();
			int ro=employeeService.updateSalary(empId, eSal);
			if (ro > 0)
				System.out.println("Employee Salary updated for ID "+empId);
			else
				System.out.println("Employee Salary updation Failed!");
			break;
		case 6:
			System.out.println("Have a Nice Day!!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
