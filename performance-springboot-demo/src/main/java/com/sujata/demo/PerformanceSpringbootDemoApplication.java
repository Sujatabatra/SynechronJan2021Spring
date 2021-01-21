package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.component.Juggler;
import com.sujata.component.Performer;


@SpringBootApplication(scanBasePackages="com.sujata.component")
public class PerformanceSpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Amit")
	private Performer p1;
	
	@Autowired
	@Qualifier("Divya")
	private Performer p2;

	@Autowired
	@Qualifier("Geetinder")
	private Performer p3;
	
	
	@Autowired
	@Qualifier("Manoj")
	private Performer p4;
	
	public static void main(String[] args) {

		SpringApplication.run(PerformanceSpringbootDemoApplication.class, args);
//		ApplicationContext springContainer=SpringApplication.run(PerformanceSpringbootDemoApplication.class, args);
//		
//		Performer p1=(Performer)springContainer.getBean("Divya");
//		p1.perform();
//		
//		Performer p2=(Performer)springContainer.getBean("Geetinder");
//		p2.perform();
//		
//		Performer p3=(Performer)springContainer.getBean("Amit");
//		p3.perform();
	}

	@Override
	public void run(String... args) throws Exception {
		p1.perform();
		p2.perform();
		p3.perform();
		p4.perform();
	}
	@Bean
	public Juggler Manoj(){
		Juggler j=new Juggler();
		j.setBalls(8);
		return j;
	}

}
