package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rest.model.Employee;

@Path("/emp")
public class EmployeeController {
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<Employee> getAll(){
		List<Employee> list= new ArrayList<>();
		list.add(new Employee(101,"shubham",24,"abc"));
		list.add(new Employee(102,"anil",24,"xyz"));
		return  list;
	}

}
