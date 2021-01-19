package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyThirdExample {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		Scanner sc=new Scanner(System.in);
		try {
			//1.Connect
			//1.1 Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			//1.2 Connection to DB
			connection=DriverManager.getConnection("jdbc:mysql"
					+ "://localhost/mydb", "root", "sujata");
			
			//2.Query
			statement=connection.createStatement();
			System.out.println("Enter ID to be deleted : ");
			int id=sc.nextInt();
			int rows=statement.executeUpdate("DELETE FROM EMPL WHERE EMPID="+id);
			
			//3.Process Result
			if(rows>0){
				System.out.println("Record Deleted!");
			}
			else{
				System.out.println("Deletion Failed");
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
