package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujata.presentation.EmployeeUserInterface;

@SpringBootApplication(scanBasePackages="com.sujata")
public class FirstJdbcSpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeUserInterface empUi;

	public static void main(String[] args) {
		SpringApplication.run(FirstJdbcSpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			empUi.showMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			empUi.performMenu(choice);
		}

	}

}
