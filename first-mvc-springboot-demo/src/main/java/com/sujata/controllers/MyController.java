package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/first")
	public ModelAndView firstController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome to the world of Spring Boot Web MVC Application! ");
		mv.setViewName("first");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView secondController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Welcome once again to the world of Spring Boot Web MVC Application! ");
		mv.setViewName("first");
		return mv;
	}
}
