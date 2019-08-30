package com.terence.springdemo.service;

import com.terence.springdemo.dao.BaseDao;
import com.terence.springdemo.entities.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	private BaseDao dao;

	@Override
	public void addUser(BaseUser user) {
		dao.addUser(user);
	}

	@Override
	public List<BaseUser> searchUsers() {
		return dao.searchUsers();
	}
}
