package com.sujata.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/")
	public ModelAndView loginPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		User user=new User(uname, pwd);
		String message;
		if(loginService.loginCheck(user))
			message="Login Successful!";
		else
			message="Login Failed!";
		mv.addObject("message", message);
		mv.setViewName("result");
		
		return mv;
	}
}
