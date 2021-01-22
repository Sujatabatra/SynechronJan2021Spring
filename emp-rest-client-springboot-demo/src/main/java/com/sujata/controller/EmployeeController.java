package com.sujata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.bean.Employees;
import com.sujata.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public ModelAndView displayMainPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/getEmpByIDPage")
	public ModelAndView getEmpIDPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("inputEmpIDPage");
		return mv;
	}
	
	@RequestMapping("/searchEmp")
	public ModelAndView serachEmployeeController(@RequestParam("eid")int empId){
		ModelAndView mv=new ModelAndView();
		Employee emp=empService.serachEmployeeById(empId);
		mv.addObject("employee", emp);
		mv.setViewName("showEmp");
		return mv;
	}
	
	@RequestMapping("/allEmps")
	public ModelAndView searchAllEmployeesController(){
		ModelAndView mv=new ModelAndView();
		Employees emps=empService.getAllEmployees();
		List<Employee> empList=emps.getEmpList();
		mv.addObject("employees", empList);
		mv.setViewName("showAllEmps");
		return mv;
	}
}
