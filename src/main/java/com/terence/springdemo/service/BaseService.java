package com.terence.springdemo.service;


import com.terence.springdemo.entities.BaseUser;

public interface BaseService {
	void addUser(BaseUser user);
	String returnStrForTest();
}
