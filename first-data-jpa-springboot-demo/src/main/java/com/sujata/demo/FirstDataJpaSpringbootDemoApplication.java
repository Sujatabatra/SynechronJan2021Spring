package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Employee;
import com.sujata.dao.EmployeeDao;
import com.sujata.presentation.EmployeeUserInterface;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.dao")
@EntityScan(basePackages="com.sujata.bean")
public class FirstDataJpaSpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeUserInterface empUi;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstDataJpaSpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			empUi.showMenu();
			System.out.println("Enter choice ");
			int choice=scanner.nextInt();
			empUi.performMenu(choice);
			
					
		}
		
	}

}
