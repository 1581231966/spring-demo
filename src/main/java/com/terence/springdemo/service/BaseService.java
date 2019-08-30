package com.terence.springdemo.service;

import com.terence.springdemo.entities.BaseUser;

import java.util.List;

public interface BaseService {
	void addUser(BaseUser user);
	List<BaseUser> searchUsers();
}
