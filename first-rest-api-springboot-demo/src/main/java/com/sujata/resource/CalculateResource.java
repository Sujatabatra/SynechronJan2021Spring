package com.sujata.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateResource {

	@RequestMapping(path="/sum/{n1}/{n2}",method=RequestMethod.GET)
	public int sum(@PathVariable("n1")int number1,@PathVariable("n2")int number2){
		int s=number1+number2;
		return s;
	}
	
	@RequestMapping(path="/product/{n1}/{n2}",method=RequestMethod.GET)
	public int product(@PathVariable("n1")int number1,@PathVariable("n2")int number2){
		int s=number1*number2;
		return s;
	}
	
	@GetMapping("/factorial/{no}")
	public int factorial(@PathVariable("no")int number){
		int f=1;
		while(number>=1)
			f*=number--;
		return f;
	}
}
