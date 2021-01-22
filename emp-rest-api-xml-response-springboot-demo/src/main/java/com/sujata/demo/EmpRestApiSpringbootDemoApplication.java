package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.sujata")
@EnableJpaRepositories(basePackages="com.sujata.dao")
@EntityScan(basePackages="com.sujata.bean")
public class EmpRestApiSpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRestApiSpringbootDemoApplication.class, args);
	}

}
