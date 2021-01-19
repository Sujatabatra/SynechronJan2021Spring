package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecondExample {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			//1.Connect
			//1.1 Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			//1.2 Connection to DB
			connection=DriverManager.getConnection("jdbc:mysql"
					+ "://localhost/mydb", "root", "sujata");
			
			//2.Query
			statement=connection.createStatement();
			int rows=statement.executeUpdate("INSERT INTO EMPL VALUE(104,'DDDDD','EXECUTUVE','IT',123456)");
			
			//3.Process Result
			if(rows>0){
				System.out.println("Record Inserted!");
			}
			else{
				System.out.println("Insersion Failed");
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally{
			//4. Close 
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
