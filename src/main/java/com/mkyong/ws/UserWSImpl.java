package com.mkyong.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.dao.UserDAO;
import com.mkyong.entities.User;

@WebService
public class UserWSImpl {
	
//	public UserDAO getUserDAO() {
//		return userDAO;
//	}
	
	@WebMethod(exclude=true)	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Autowired
	private UserDAO userDAO;
	
	@WebMethod
	public List<User> findAll() {
		return userDAO.findAll();
	}

}
