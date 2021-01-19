package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.sujata")
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
}
