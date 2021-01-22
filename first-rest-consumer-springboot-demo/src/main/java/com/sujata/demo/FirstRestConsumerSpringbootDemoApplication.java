package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstRestConsumerSpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstRestConsumerSpringbootDemoApplication.class, args);
		
		
	}

	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no for calculating factorial : ");
		int no=sc.nextInt();
		Integer fac=restTemplate.getForObject("http://localhost:8085/calculate/factorial/"+no, Integer.class);
		System.out.println("Factorial = "+fac);
	}
}
