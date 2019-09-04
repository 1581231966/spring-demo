package com.terence.springdemo.service;

import com.terence.springdemo.dao.BaseDao;
import com.terence.springdemo.entities.BaseUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaseServiceImpl implements BaseService {

	private static final Logger logger = Logger.getLogger(BaseServiceImpl.class.getName());
	@Autowired
	private BaseDao dao;

	@Override
	public void addUser(BaseUser user) {
		logger.info("----Start to save a user entity.----");
		dao.save(user);
		for (BaseUser responeUser : dao.findAll()){
			System.out.println(responeUser.toString());
		}
		logger.info("------------Save done.--------------");
	}

	@Override
	public String returnStrForTest() {
		return "Spring-demo is running";
	}


}
