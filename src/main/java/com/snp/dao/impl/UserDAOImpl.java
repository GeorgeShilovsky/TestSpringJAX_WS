package com.snp.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.snp.dao.UserDAO;
import com.snp.entities.User;
import com.snp.entities.mappers.UserMapper;


public class UserDAOImpl implements UserDAO {
	
	private Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public List<User> findAll() {
		logger.info("find all users");
		return jdbcTemplate.query("select id, name from users", new UserMapper());
	}

	@Override
	public User byId(Long id) {
		logger.info("find by id " + id);
		return (User)jdbcTemplate.queryForObject("select id, name from users where id = ?", new Object[] { id }, new UserMapper());
	}
	

}
