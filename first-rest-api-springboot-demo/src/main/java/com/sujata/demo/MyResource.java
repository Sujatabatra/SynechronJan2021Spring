package com.sujata.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	
	@GetMapping(path="/first")
	public String firstResource(){
		return "Hi I am first Rest API!";
	}
	
	@GetMapping(path="/greet/{na}")
	public String wish(@PathVariable("na")String name){
		return "Welcome "+name+" to the world of Rest API";
	}
	
	
}
