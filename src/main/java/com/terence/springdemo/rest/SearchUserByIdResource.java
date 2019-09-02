package com.terence.springdemo.rest;

import com.terence.springdemo.entities.BaseUser;
import com.terence.springdemo.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@RestController
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

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testSpringDemo(){
		return "Spring-demo is running!";
	}
}
