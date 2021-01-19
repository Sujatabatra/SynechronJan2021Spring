package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstExample {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			//1.Connect
			//1.1 Register Driver 
			Class.forName("com.mysql.jdbc.Driver"); //Checked Exception ClassNotFoundException
			//1.2 Connection to DB
			connection=DriverManager.getConnection("jdbc:mysql"
					+ "://localhost/mydb", "root", "sujata"); //Check Exception as IOException
			
			//2.Query (DQL : return type -> ResultSet)
			statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery("SELECT * FROM EMPL");
			
			//3.Process Result
			while(resultset.next()){
				int id=resultset.getInt("EMPID");
				String name=resultset.getString("EMPNAME");
				String des=resultset.getString("DESIG");
				String dep=resultset.getString("DEPART");
				int bas=resultset.getInt("BASIC");
				System.out.println(id+" "+name+" "+des+" "+dep);
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
