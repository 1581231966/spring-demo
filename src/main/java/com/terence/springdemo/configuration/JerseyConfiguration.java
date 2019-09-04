package com.terence.springdemo.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration(){
		packages("com.terence.springdemo.rest");
	}
}
