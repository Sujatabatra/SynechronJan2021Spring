package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.User;
import com.sujata.model.dao.UserDao;

@Service
public class LoginService {

	@Autowired
	private UserDao userDao;
	
	public boolean loginCheck(User user){
		String password=userDao.getPassword(user.getUserName());
		return user.getPassword().equals(password);
	}
}
