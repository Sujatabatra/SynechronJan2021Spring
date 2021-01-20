package com.sujata.model.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	static HashMap<String, String> users=new HashMap<String, String>();
	static{
		users.put("Sujata", "Batra");
		users.put("Admin", "Admin123");
		users.put("user", "User456");
	}
	
	public String getPassword(String userName){
		return users.get(userName);
	}
}
