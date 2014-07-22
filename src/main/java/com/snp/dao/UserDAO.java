package com.snp.dao;

import java.util.List;

import com.snp.entities.User;

public interface UserDAO {
	List<User> findAll();
	User byId(Long id);
}
