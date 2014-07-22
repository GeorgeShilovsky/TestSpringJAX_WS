package com.snp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snp.dao.UserDAO;
import com.snp.entities.User;

@RestController
public class UserRest {
	
	private Logger logger = LoggerFactory.getLogger(UserRest.class);
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value = "/rest/users", produces = {"application/json"})
//	@ResponseStatus(value = HttpStatus.OK)
	public List<User> findAll() {
		List<User> users = userDAO.findAll();
		logger.info(users.toString());
		return users;
	}
	
	@RequestMapping(value = "/rest/user", produces = "application/json")
//	@ResponseStatus(value = HttpStatus.OK)
	public User byId(@RequestParam(value="id", required = true) Long id) {
		User user = userDAO.byId(id);
		logger.info(user.toString());
		return user;
	}

}
