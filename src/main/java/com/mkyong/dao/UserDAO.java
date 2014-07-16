package com.mkyong.dao;

import java.util.List;

import com.mkyong.entities.User;

public interface UserDAO {
	List<User> findAll();
}
