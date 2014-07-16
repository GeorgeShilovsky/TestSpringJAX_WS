package com.mkyong.entities.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mkyong.entities.User;

public class UserMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		User user = new User();
		user.setId(resultSet.getLong("id"));
		user.setName(resultSet.getString("name"));
		return user;
	}

}
