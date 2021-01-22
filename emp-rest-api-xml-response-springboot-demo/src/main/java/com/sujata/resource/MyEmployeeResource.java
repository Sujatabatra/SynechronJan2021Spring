package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.bean.Employees;
import com.sujata.dao.EmployeeDao;
import com.sujata.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class MyEmployeeResource {

	@Autowired
	EmployeeService empService;
	
	@GetMapping(path="/{id}",produces="application/xml")
	public Employee getEmployeeByIdResource(@PathVariable("id")int id){
		return empService.getEmployeeById(id);
	}
	
	@GetMapping(produces="application/xml")
	public Employees getAllEmployees(){
		return new Employees(empService.getAllEmployees());
	}
	
	@PostMapping(consumes="application/json")
	public Employee saveEmployee(@RequestBody Employee employee){
		Employee emp=empService.insertEmployee(employee);
		return emp;
	}
	
	@PutMapping(path="/{id}/{salary}")
	public Employee modifyEmployeeSalaryResource(@PathVariable("id")int id,@PathVariable("salary")int salary){
		Employee emp=empService.updateEmpSalary(id, salary);
		return emp;
	}
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployeeResource(@PathVariable("id")int id){
		Employee e=empService.deleteEmployee(id);
		return e;
	}
}
