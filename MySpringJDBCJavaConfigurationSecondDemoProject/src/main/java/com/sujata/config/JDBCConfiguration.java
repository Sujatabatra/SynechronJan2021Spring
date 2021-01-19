package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sujata.dao.EmployeeDaoImpl;
import com.sujata.presentation.EmployeeUserInterfaceImpl;
import com.sujata.service.EmployeeServiceImpl;

@Configuration
public class JDBCConfiguration {

	@Bean
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/mydb");
		ds.setUsername("root");
		ds.setPassword("sujata");
		return ds;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}
	
	@Bean
	public EmployeeDaoImpl empDao(){
		EmployeeDaoImpl empDaoImpl=new EmployeeDaoImpl();
		empDaoImpl.setJdbcTemplate(jdbcTemplate());
		return empDaoImpl;
	}
	@Bean
	public EmployeeServiceImpl empService(){
		EmployeeServiceImpl empSer=new EmployeeServiceImpl();
		empSer.setEmployeeDao(empDao());
		return empSer;
	}
	
	@Bean
	public EmployeeUserInterfaceImpl empUi(){
		EmployeeUserInterfaceImpl eui=new EmployeeUserInterfaceImpl();
		eui.setEmployeeService(empService());
		return eui;
	}
}
