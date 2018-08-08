package com.rest.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.controller.EmployeeController;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		// TODO Auto-generated constructor stub
		register(EmployeeController.class);
	}
}
