package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	//MappingHandler
	@RequestMapping("/first")
	public ModelAndView firstController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome to the world of Spring Web MVC");
		mv.setViewName("first");
		return mv;
	}
	
	
	@RequestMapping("/second")
	public ModelAndView secondController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome once again to the world of Spring Web MVC");
		mv.setViewName("first");
		return mv;
	}
}
