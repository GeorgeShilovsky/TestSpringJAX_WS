package com.mkyong.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mkyong.dao.UserDAO;
import com.mkyong.entities.User;
import com.mkyong.entities.mappers.UserMapper;

public class UserDAOImpl implements UserDAO {
	
	private Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	public void setDataSource(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		logger.info("find all users");
		return jdbcTemplate.query("select id, name from users", new UserMapper());
	}
	

}
