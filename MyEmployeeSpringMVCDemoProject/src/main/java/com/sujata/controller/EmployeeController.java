package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public ModelAndView mainPageConroller(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/searchPage")
	public ModelAndView searchEmpPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("acceptEmpId");
		return mv;
	}
	@RequestMapping("/searchEmpById")
	public ModelAndView searchEmpController(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String id=request.getParameter("empId");
		Employee employee=empService.getEmployeeById(Integer.parseInt(id));
			mv.addObject("emp", employee);
			mv.setViewName("showEmployee");
		return mv;
	}
	
	@RequestMapping("/empDataInputPage")
	public ModelAndView empDataInputController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("inputEmpDetails");
		return mv;
	}
	
	@RequestMapping("/insertEmp")
	public ModelAndView saveEmpConctroller(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String id=request.getParameter("eId");
		String name=request.getParameter("eName");
		String desig=request.getParameter("desig");
		String deptt=request.getParameter("deptt");
		String salary=request.getParameter("salary");
		
		Employee employee=new Employee(Integer.parseInt(id), name, desig, deptt, Integer.parseInt(salary));
		
		int rows=empService.insertEmployee(employee);
		String message;
		if(rows>0)
			message="Employee Record Added succesfully!!";
		else
			message="Employee Not Added";
		mv.addObject("message", message);
		mv.setViewName("acknowlegment");
		return mv;
	}
	
	@RequestMapping("/deleteEmpPage")
	public ModelAndView deleteEmpPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("deleteEmpPage");
		return mv;
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmpController(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String id=request.getParameter("eId");
		String message;
		int rows=empService.deleteEmployee(Integer.parseInt(id));
		if(rows>0)
			message="Employee with id"+id+" deleted Sucessfully";
		else
			message="Employee Not deleted";
		mv.addObject("message", message);
		mv.setViewName("acknowlegment");
		return mv;
	}
	
	@RequestMapping("/updateEmpPage")
	public ModelAndView updateEmpPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("updateEmp");
		return mv;
	}
	
	@RequestMapping("/updateEmpSalary")
	public ModelAndView updateEmpController(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String id=request.getParameter("eId");
		String salary=request.getParameter("eSalary");
		int rows=empService.updateSalary(Integer.parseInt(id), Integer.parseInt(salary));
		String message;
		if(rows>0)
			message="Employee Salary Updated Successfully!!";
		else
			message="Unable to update Employee Salary";
	
		mv.addObject("message", message);
		mv.setViewName("acknowlegment");
		return mv;
	}
	
	@RequestMapping("/allEmps")
	public ModelAndView getEmployeesController(){
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=empService.getAllEmployees();
		mv.addObject("employees", employees);
		mv.setViewName("showAllEmployees");
		return mv;
	}
}
