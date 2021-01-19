package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MyPreparedStatementExample {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement pStatement=null;
		Scanner sc=new Scanner(System.in);
		try {
			//1.Connect
			//1.1 Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			//1.2 Connection to DB
			connection=DriverManager.getConnection("jdbc:mysql"
					+ "://localhost/mydb", "root", "sujata");
//			connection.setAutoCommit(false);
			//2.Query
			pStatement=connection.prepareStatement("DELETE FROM EMPL WHERE EMPID=?");
			System.out.println("Enter ID to be deleted : ");
			int id=sc.nextInt();
			pStatement.setInt(1, id);
			int rows=pStatement.executeUpdate();
			
			//3.Process Result
			if(rows>0){
				System.out.println("Record Deleted!");
			}
			else{
				System.out.println("Deletion Failed");
			}
//			connection.commit();
		} catch (ClassNotFoundException|SQLException e) {
//			connection.rollback();
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
