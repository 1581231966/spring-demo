package com.terence.springdemo.rest;

import com.terence.springdemo.entities.BaseUser;
import com.terence.springdemo.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/user")
public class SearchUserByIdResource {

	/*This is service*/
	@Autowired
	private BaseServiceImpl service;
	@Path("/users")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUserToEs(BaseUser user){
		service.addUser(user);
	}
}
