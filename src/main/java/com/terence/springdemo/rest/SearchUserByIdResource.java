package com.terence.springdemo.rest;

import com.terence.springdemo.entities.BaseUser;
import com.terence.springdemo.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/terence")
@Component
public class SearchUserByIdResource {

	/*This is service*/
	@Autowired
	private BaseServiceImpl service;

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testSpringDemo(){
		return service.returnStrForTest();
	}

	@Path("/user")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addUser(BaseUser user){
		service.addUser(user);
		return "End";
	}
}
